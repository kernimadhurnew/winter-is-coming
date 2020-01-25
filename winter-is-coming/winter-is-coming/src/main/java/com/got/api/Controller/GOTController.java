package com.got.api.Controller;



import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.got.api.model.ListModel;
import com.got.api.repository.BattleRepository;


@RestController
public class GOTController {
	
	@Autowired
	BattleRepository battleRepositry;
	
	@GetMapping("/list")
	public List<ListModel> getAllRegion(){
		return battleRepositry.findList();
	}
	
	@GetMapping("/count")
	public int getCount() {
		return battleRepositry.count();
	}
	
	@GetMapping("/battle/{id}")
	public Optional<ListModel> getBattle(@PathVariable String id) {
															//need to handle the exception here for - of id doesn't exists in the records
		return battleRepositry.getBattleById(id);

	}
}
