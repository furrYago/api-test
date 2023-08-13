package com.furryago.apitest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	public Customer() {

	}

	public Customer(String name, String email, String cpf, Address address) {
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.address = address;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, columnDefinition = "VARCHAR(100)")
	private String name;

	@Column(unique = true, nullable = false, columnDefinition = "VARCHAR(100)")
	private String email;

	@Column(nullable = false, columnDefinition = "VARCHAR(12)")
	private String cpf;

	@OneToOne(mappedBy = "customer")
	private Address address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
