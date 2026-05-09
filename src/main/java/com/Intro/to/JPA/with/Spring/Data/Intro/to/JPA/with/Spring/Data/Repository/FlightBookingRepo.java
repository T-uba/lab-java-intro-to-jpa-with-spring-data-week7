package com.Intro.to.JPA.with.Spring.Data.Intro.to.JPA.with.Spring.Data.Repository;

import com.Intro.to.JPA.with.Spring.Data.Intro.to.JPA.with.Spring.Data.Model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

    public interface FlightBookingRepo extends JpaRepository<FlightBooking, Integer> {

        // Findet Buchungen anhand der Kunden-ID
        List<FlightBooking> findByCustomerId(Integer customerId);

}
