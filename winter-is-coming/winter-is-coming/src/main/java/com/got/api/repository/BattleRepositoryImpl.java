package com.got.api.repository;


import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.got.api.model.ListModel;

@Repository
public class BattleRepositoryImpl implements BattleRepository {
	
	 @Autowired 
	 private JdbcTemplate jdbcTemplate;
	 
	 @Autowired
	    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	 

	public List<ListModel> findList() {

        List<ListModel> result = jdbcTemplate.query(
                "SELECT battle_number,location,region FROM got.battle_info",
                (rs, rowNum) -> new ListModel(
                        rs.getString("location"), rs.getString("region"))
        );

        return result;
}
	public int count() {

       int result = jdbcTemplate.queryForObject(
                "SELECT count(*) FROM got.battle_info",
                Integer.class);

        return result;
}	
	
	 
	    public Optional<ListModel> getBattleById(String id) {
	        return namedParameterJdbcTemplate.queryForObject(
	                "SELECT * FROM got.battle_info where battle_info.battle_number=:id",
	                new MapSqlParameterSource("id",id),
	                (rs, rowNum) ->
	                        Optional.of(new ListModel(
	                                rs.getString("battle_number"),
	                                rs.getString("name"),
	                                rs.getString("year"),
	                                rs.getString("attacker_king"),
	                                rs.getString("defender_king"),
	                                rs.getString("attacker_1"),
	                                rs.getString("attacker_2"),
	                                rs.getString("attacker_3"),
	                                rs.getString("attacker_4"),
	                                rs.getString("defender_1"),
	                                rs.getString("defender_2"),
	                                rs.getString("defender_3"),
	                                rs.getString("defender_4"),
	                                rs.getString("attacker_outcome"),
	                                rs.getString("battle_type"),
	                                rs.getString("major_death"),
	                                rs.getString("major_capture"),
	                                rs.getString("attacker_size"),
	                                rs.getString("defender_size"),
	                                rs.getString("attacker_commander"),
	                                rs.getString("defender_commander"),
	                                rs.getString("summer"),
	                                rs.getString("location"), 
	                                rs.getString("region"), 
	                                rs.getString("note")
	                        ))
	        
	        );
	    }
	    
	    // will be used when exception handling will be done for /battle/{id}
	    public Optional<ListModel> checkBattle(String id) {
	        return namedParameterJdbcTemplate.queryForObject(
	                "SELECT name FROM got.battle_info where battle_number=:id",
	                new MapSqlParameterSource("id",id),
	                (rs, rowNum) ->
	                        Optional.of(new ListModel(
	                                rs.getString("name"))));}
}
