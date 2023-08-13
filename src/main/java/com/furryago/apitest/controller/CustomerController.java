package com.furryago.apitest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.furryago.apitest.model.Customer;
import com.furryago.apitest.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@CrossOrigin(origins = "*")
	@PostMapping("/customer")
	public void createCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
	}

	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable Long id) {
		return customerService.getCustomerById(id);
	}

	@GetMapping("/customer")
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	}

	@PutMapping("/customer/{id}")
	public void updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
		customer.setId(id);
		customerService.update(customer);
	}

	@DeleteMapping("/customer/{id}")
	public void deleteCustomer(@PathVariable Long id) {
		customerService.delete(id);
	}

}
