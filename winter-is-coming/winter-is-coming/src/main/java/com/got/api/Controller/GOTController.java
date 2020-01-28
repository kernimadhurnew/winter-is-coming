package com.got.api.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.got.api.Exceptions.GOTExceptions;
import com.got.api.model.ListModel;
import com.got.api.repository.BattleRepository;


@RestController
public class GOTController {
	
	@Autowired
	BattleRepository battleRepositry;
	
	@GetMapping("/list")
	public List<Object[]> getAllRegion(){
		return battleRepositry.findEmp_name();
	}
	
	@GetMapping("/count")
	public int getCount() {
		return battleRepositry.counts();
	}
	
	@GetMapping("/battle/{id}")
	public ListModel getBattle(@PathVariable String id) {
		 return Optional.ofNullable(battleRepositry.findByBattle(id)).orElseThrow(() -> new GOTExceptions("Battle Number Not Found"));
}
}
