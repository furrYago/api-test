package com.furryago.apitest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.furryago.apitest.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
