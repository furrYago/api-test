package com.furryago.apitest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furryago.apitest.model.Customer;
import com.furryago.apitest.repository.CustomerRepository;

@Service
public class CustomerServiceBean implements CustomerService {
	
	@Autowired
	private CustomerRepository repository;

	@Override
	public Customer saveCustomer(Customer customer) {
		return repository.save(customer);
	}

	@Override
	public Customer getCustomerById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Customer> getCustomers() {
		return repository.findAll();
	}

	@Override
	public void update(Customer customer) {
		repository.save(customer);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
