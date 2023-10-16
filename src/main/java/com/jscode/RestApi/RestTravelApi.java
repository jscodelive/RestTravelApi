package com.jscode.RestApi;

import com.jscode.RestApi.domain.repositories.FlyRepository;
import com.jscode.RestApi.domain.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.hibernate.query.sqm.tree.SqmNode.log;

@SpringBootApplication
public class RestTravelApi implements CommandLineRunner {


	@Autowired
	private HotelRepository hotelRepository;

	@Autowired
	private FlyRepository flyRepository;


	public static void main(String[] args) {
		SpringApplication.run(RestTravelApi.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var fly = flyRepository.findById(14L).get();
		var hotel = hotelRepository.findById(7L).get();


		log.info(String.valueOf(fly));
		log.info(String.valueOf(hotel));

	}
}
