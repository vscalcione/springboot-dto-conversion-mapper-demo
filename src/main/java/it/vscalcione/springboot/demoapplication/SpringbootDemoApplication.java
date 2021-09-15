package it.vscalcione.springboot.demoapplication;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import it.vscalcione.springboot.demoapplication.model.Location;
import it.vscalcione.springboot.demoapplication.model.User;
import it.vscalcione.springboot.demoapplication.repository.LocationRepository;
import it.vscalcione.springboot.demoapplication.repository.UserRepository;

@ComponentScan("it.vscalcione.springboot.demoapplication")
@SpringBootApplication
public class SpringbootDemoApplication implements CommandLineRunner{

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	@Autowired
	private LocationRepository locationRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("Pune");
		location.setDescription("Pune is great place to live");
		location.setLongitude(40.5);
		location.setLatitude(30.6);
		locationRepository.save(location);

		User firstUser = new User();
		firstUser.setFirstName("Ramesh");
		firstUser.setLastName("Fadatare");
		firstUser.setEmail("ramesh@gmail.com");
		firstUser.setPassword("secret");
		firstUser.setLocation(location);
		userRepository.save(firstUser);

		User secondUser = new User();
		secondUser.setFirstName("John");
		secondUser.setLastName("Cena");
		secondUser.setEmail("john@gmail.com");
		secondUser.setPassword("secret");
		secondUser.setLocation(location);
		userRepository.save(secondUser);
	}

}
