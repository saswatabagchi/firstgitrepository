package com.saswata.spring.java.configaration.javaconfigaretion;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void saveEmployee() {
		address.saveAddress();
	}
    
	@Autowired
	private Address address;

}
