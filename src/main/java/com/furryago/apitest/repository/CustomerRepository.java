package com.furryago.apitest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.furryago.apitest.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
