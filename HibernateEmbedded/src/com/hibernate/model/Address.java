package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	@Column(name="address" , length=255)
	private String addressLine;
	
	@Column(name="city" , length=255)
	private String city;
	
	@Column(name="state" , length=255)
	private String state;		
	
	public Address() {
		super();
	}
	
	public Address(String addressLine, String city, String state) {
		super();
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
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
