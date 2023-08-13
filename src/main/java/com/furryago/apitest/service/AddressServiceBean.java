package com.furryago.apitest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furryago.apitest.model.Address;
import com.furryago.apitest.repository.AddressRepository;

@Service
public class AddressServiceBean implements AddressService {
	
	@Autowired
	private AddressRepository repository;

	@Override
	public Address saveAddress(Address address) {
		return repository.save(address);
	}

	@Override
	public Address getAddressById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Address> getAddresses() {
		return repository.findAll();
	}

	@Override
	public void update(Address address) {
		repository.save(address);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
