package TouristRegistration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.intThat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import TouristRegistration.Entity.Tourist;
import TouristRegistration.Repository.TouristsRepository;

@SpringBootTest
class ApplicationTests {
	
	@Autowired
	private TouristsRepository touristsRepository;
	
	@Test
	@DisplayName(value = "Testing Register a Tourist")
	@Order(1)
	void testRegisterTourist() {
		Tourist tourist=new Tourist();
		tourist.setId(1211);
		tourist.setFirstName("Ram");
		tourist.setLastName("Pitla");
		tourist.setGender("male");
		tourist.setAge(22);
		tourist.setFromPlace("UK");
		tourist.setNumberofDaysVisits(12);
		touristsRepository.save(tourist);
		 assertNotNull(touristsRepository.findById((long)1211).get());
		
	}
	
	@Test
	@DisplayName(value = "Testing List of Tourists By Name in The Descending Order ")
	@Order(2)
	void testGetTouristsByNameDesc() {
		
		Tourist tourist=new Tourist();
		tourist.setId(1311);
		tourist.setFirstName("Laxman");
		tourist.setLastName("Karla");
		tourist.setGender("male");
		tourist.setAge(21);
		tourist.setFromPlace("London");
		tourist.setNumberofDaysVisits(12);
		touristsRepository.save(tourist);
		
		List<Tourist> list = touristsRepository.findAllByOrderByFirstNameDesc();
		
		assertTrue(list.get(0).getFirstName().compareToIgnoreCase(list.get(1).getFirstName())>0);
		
		//assertThat(list.get(1).getFirstName().compareToIgnoreCase(list.get(0).getFirstName())>0); 
		//Collections.reverse(list);
		//assertThat(list).isSorted().
		//assertTrue(tourist.getFirstName().compareToIgnoreCase(tourist1.getFirstName())>0);
	}

}
