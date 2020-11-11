package com.saswata.spring.java.configaration.javaconfigaretion;

public class Address {
	
	private int hno;

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + ", city=" + city + "]";
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void saveAddress () {
		System.out.println("Address is saved ");
	}

	private String street;
	private String city;

}
