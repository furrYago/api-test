package com.furryago.apitest.service;

import java.util.List;

import com.furryago.apitest.model.Address;

public interface AddressService {

	Address saveAddress(Address address);

	Address getAddressById(Long id);

	List<Address> getAddresses();

	void update(Address address);

	void delete(Long id);

}
