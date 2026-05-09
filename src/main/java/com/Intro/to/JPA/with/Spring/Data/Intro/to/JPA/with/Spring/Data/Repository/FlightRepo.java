package com.Intro.to.JPA.with.Spring.Data.Intro.to.JPA.with.Spring.Data.Repository;

import com.Intro.to.JPA.with.Spring.Data.Intro.to.JPA.with.Spring.Data.Model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

    public interface FlightRepo extends JpaRepository<Flight, Integer> {

        List<Flight> findByFlightNumber(String flightNumber);

    }

