package com.got.api.repository;

import java.util.List;
import java.util.Optional;

import com.got.api.model.ListModel;

public interface BattleRepository {
	
	 List<ListModel> findList();
	 int count();
	 Optional<ListModel> getBattleById(String id);
	  Optional<ListModel> checkBattle(String id);
}
