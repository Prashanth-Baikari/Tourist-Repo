package TouristRegistration.Service;

import java.util.List;

import TouristRegistration.Entity.Tourist;

public interface TouristsService {

	Tourist registerTourist( Tourist tourist);
	
	 List<Tourist> getTourists();
	 
	 List<Tourist> getTouristsByNameDesc();
}
