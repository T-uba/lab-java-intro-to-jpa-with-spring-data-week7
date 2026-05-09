package com.Intro.to.JPA.with.Spring.Data.Intro.to.JPA.with.Spring.Data.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    private CustomerStatus status;
    private Integer totalCustomerMileage;

    public Customer() {
    }

    public Customer(String name, CustomerStatus status, Integer totalCustomerMileage) {
        this.name = name;
        this.status = status;
        this.totalCustomerMileage = totalCustomerMileage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    public Integer getTotalCustomerMileage() {
        return totalCustomerMileage;
    }

    public void setTotalCustomerMileage(Integer totalCustomerMileage) {
        this.totalCustomerMileage = totalCustomerMileage;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", totalCustomerMileage=" + totalCustomerMileage +
                '}';
    }
}

