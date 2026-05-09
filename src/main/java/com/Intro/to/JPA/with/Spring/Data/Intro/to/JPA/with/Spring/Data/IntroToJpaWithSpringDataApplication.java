package com.Intro.to.JPA.with.Spring.Data.Intro.to.JPA.with.Spring.Data;

import com.Intro.to.JPA.with.Spring.Data.Intro.to.JPA.with.Spring.Data.Model.Customer;
import com.Intro.to.JPA.with.Spring.Data.Intro.to.JPA.with.Spring.Data.Model.CustomerStatus;
import com.Intro.to.JPA.with.Spring.Data.Intro.to.JPA.with.Spring.Data.Model.Flight;
import com.Intro.to.JPA.with.Spring.Data.Intro.to.JPA.with.Spring.Data.Model.FlightBooking;
import com.Intro.to.JPA.with.Spring.Data.Intro.to.JPA.with.Spring.Data.Repository.CustomerRepo;
import com.Intro.to.JPA.with.Spring.Data.Intro.to.JPA.with.Spring.Data.Repository.FlightBookingRepo;
import com.Intro.to.JPA.with.Spring.Data.Intro.to.JPA.with.Spring.Data.Repository.FlightRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IntroToJpaWithSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroToJpaWithSpringDataApplication.class, args);
	}

	@Bean
	CommandLineRunner run(CustomerRepo customerRepo,
	                      FlightRepo flightRepo,
	                      FlightBookingRepo bookingRepo) {

		return args -> {

			Customer alice = customerRepo.save(
					new Customer("Alice", CustomerStatus.GOLD, 120000));
			Flight flight = flightRepo.save(
					new Flight("AB123", "Boeing 747", 300, 400));
			bookingRepo.save(
					new FlightBooking(alice.getId(), flight.getId()));


			Customer bob = customerRepo.save(
					new Customer("Bob", CustomerStatus.SILVER, 45000));
			Flight flight2 = flightRepo.save(
					new Flight("LH456", "Airbus A350", 250, 650));
			bookingRepo.save(
					new FlightBooking(bob.getId(), flight2.getId()));


			Customer charlie = customerRepo.save(
					new Customer("Charlie", CustomerStatus.NONE, 5000));
			Flight flight3 = flightRepo.save(
					new Flight("EW789", "Boeing 737", 180, 150));
			bookingRepo.save(
					new FlightBooking(charlie.getId(), flight3.getId()));

			System.out.println("Search for GOLD: " + customerRepo.findByStatus(CustomerStatus.GOLD));

		};

	}

}