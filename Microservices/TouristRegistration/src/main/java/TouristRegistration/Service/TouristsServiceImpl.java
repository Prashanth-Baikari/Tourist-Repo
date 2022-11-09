package TouristRegistration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TouristRegistration.Entity.Tourist;
import TouristRegistration.Repository.TouristsRepository;

@Service
public class TouristsServiceImpl implements TouristsService {
	
	@Autowired
	private TouristsRepository touristsRepository;

	@Override
	public Tourist registerTourist(Tourist tourist) {
		return touristsRepository.save(tourist);
	}

	@Override
	public List<Tourist> getTourists() {
		return touristsRepository.findAll();
	}
	
	@Override
	public List<Tourist> getTouristsByNameDesc() {
		
		return touristsRepository.findAllByOrderByFirstNameDesc();
	}
	
	

}
