package com.jscode.RestApi;

import com.jscode.RestApi.domain.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

import static org.hibernate.query.sqm.tree.SqmNode.log;

@SpringBootApplication
public class RestTravelApi implements CommandLineRunner {


	private final HotelRepository hotelRepository;
	private final FlyRepository flyRepository;
	private final TicketRepository ticketRepository;
	private final ReservationRepository reservationRepository;
	private final TourRepository tourRepository;
	private final CustomerRepository customerRepository;

	public RestTravelApi(HotelRepository hotelRepository, FlyRepository flyRepository, TicketRepository ticketRepository, ReservationRepository reservationRepository, TourRepository tourRepository, CustomerRepository customerRepository) {
		this.hotelRepository = hotelRepository;
		this.flyRepository = flyRepository;
		this.ticketRepository = ticketRepository;
		this.reservationRepository = reservationRepository;
		this.tourRepository = tourRepository;
		this.customerRepository = customerRepository;
	}


	public static void main(String[] args) {
		SpringApplication.run(RestTravelApi.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		var fly = flyRepository.findById(15L).get();
		var hotel = hotelRepository.findById(7L).get();
		//var tour = tourRepository.findById().get();
		var ticket = ticketRepository.findById(UUID.fromString("12345678-1234-5678-2236-567812345678")).get();
		var reservation = reservationRepository.findById(UUID.fromString("32345678-1234-5678-1234-567812345678")).get();
		var customer = customerRepository.findById("WALA771012HCRGR054").get();

		log.info(String.valueOf(fly));
		log.info(String.valueOf(hotel));
		//log.info(String.valueOf(tour));
		log.info(String.valueOf(ticket));
		log.info(String.valueOf(reservation));
		log.info(String.valueOf(customer));



	}
}
