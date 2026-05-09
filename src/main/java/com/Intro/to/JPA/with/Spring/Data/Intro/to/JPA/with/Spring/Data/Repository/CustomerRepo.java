package com.Intro.to.JPA.with.Spring.Data.Intro.to.JPA.with.Spring.Data.Repository;

import com.Intro.to.JPA.with.Spring.Data.Intro.to.JPA.with.Spring.Data.Model.Customer;
import com.Intro.to.JPA.with.Spring.Data.Intro.to.JPA.with.Spring.Data.Model.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    List<Customer> findByStatus(CustomerStatus status);

    List<Customer> findByTotalCustomerMileageGreaterThan(Integer mileage);

}

