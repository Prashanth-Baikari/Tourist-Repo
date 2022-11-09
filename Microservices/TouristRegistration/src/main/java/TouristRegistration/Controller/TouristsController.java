package TouristRegistration.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TouristRegistration.Entity.Tourist;
import TouristRegistration.Service.TouristsServiceImpl;

@RestController
@RequestMapping("/tourists")
@CrossOrigin(origins = "http://localhost:4200")
public class TouristsController {
	
	@Autowired
	private TouristsServiceImpl touristsService;
	
	@PostMapping("/register")
	public Tourist registerTourist(@RequestBody Tourist tourist) {
		return touristsService.registerTourist(tourist);
	}
	
	@GetMapping("/getTourists")
	public List<Tourist> getTourists() {
		return touristsService.getTourists();
	}
	
	@GetMapping("/getTouristsByFirstName")
	public List<Tourist> getTouristsByNameDesc(){
		return touristsService.getTouristsByNameDesc();
	}

}
