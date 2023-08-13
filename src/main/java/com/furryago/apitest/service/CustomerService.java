package com.furryago.apitest.service;

import java.util.List;

import com.furryago.apitest.model.Customer;

public interface CustomerService {
	
	Customer saveCustomer(Customer customer);
	
	Customer getCustomerById(Long id);
	
	List<Customer> getCustomers();
	
	void update(Customer customer);
	
	void delete(Long id);

}
