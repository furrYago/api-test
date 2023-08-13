package com.furryago.apitest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.furryago.apitest.model.Address;
import com.furryago.apitest.service.AddressService;
import com.furryago.apitest.service.CustomerService;

@RestController
public class AddressController {

	@Autowired
	private AddressService addressService;

	@Autowired
	private CustomerService customerService;

	@PostMapping("/customer/{costumerId}/address")
	public void createAddress(@PathVariable Long costumerId, @RequestBody Address address) {
		address.setCustomer(customerService.getCustomerById(costumerId));
		addressService.saveAddress(address);
	}

	@GetMapping("/customer/address/{id}")
	public Address getAddress(@PathVariable Long id) {
		return addressService.getAddressById(id);
	}

	@GetMapping("/customer/addresses")
	public List<Address> getAddresses() {
		return addressService.getAddresses();
	}

	@PutMapping("/customer/address/{id}")
	public void updateAddress(@PathVariable Long id, @RequestBody Address address) {
		address.setId(id);
		addressService.update(address);
	}

	@DeleteMapping("/customer/address/{id}")
	public void deleteAddress(@PathVariable Long id) {
		addressService.delete(id);
	}

}
