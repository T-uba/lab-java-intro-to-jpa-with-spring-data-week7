package com.Intro.to.JPA.with.Spring.Data.Intro.to.JPA.with.Spring.Data.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class FlightBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer customerId;
    private Integer flightId;

    public FlightBooking() {
    }

    public FlightBooking(Integer id, Integer customerId) {
        this.customerId = customerId;
        this.flightId = flightId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }


    @Override
    public String toString() {
        return "FlightBooking{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", flightId=" + flightId +
                '}';
    }
}
