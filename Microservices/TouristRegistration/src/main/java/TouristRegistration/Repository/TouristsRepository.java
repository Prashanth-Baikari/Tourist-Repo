package TouristRegistration.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import TouristRegistration.Entity.Tourist;

public interface TouristsRepository  extends JpaRepository<Tourist, Long>{

	List<Tourist> findAllByOrderByFirstNameDesc();
	
	
}
