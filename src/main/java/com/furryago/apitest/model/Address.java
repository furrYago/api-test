package com.furryago.apitest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_address")
public class Address {

	public Address() {

	}

	public Address(Long id, Customer customer, String neighborhood, String street, int cep, int number, String city,
			String state) {
		this.customer = customer;
		this.neighborhood = neighborhood;
		this.street = street;
		this.cep = cep;
		this.number = number;
		this.city = city;
		this.state = state;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id", referencedColumnName = "id")
	private Customer customer;

	@Column(nullable = false, columnDefinition = "VARCHAR(100)")
	private String neighborhood;

	@Column(nullable = false, columnDefinition = "VARCHAR(100)")
	private String street;

	@Column(nullable = false, length = 10)
	private int cep;

	@Column(nullable = false, length = 10)
	private int number;

	@Column(nullable = false, columnDefinition = "VARCHAR(100)")
	private String city;

	@Column(nullable = false, columnDefinition = "VARCHAR(5)")
	private String state;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
