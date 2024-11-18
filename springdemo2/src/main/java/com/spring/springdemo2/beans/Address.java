package com.spring.springdemo2.beans;

import org.springframework.stereotype.Component;

@Component
public class Address 
{

	private String hno="1-2-3";
	private String streetName="JD peta";
	private String city="Hyderbad";
	private String State="Telangana";
	
	public Address(){}
	
	public Address(String hno, String streetName, String city, String state) {
		super();
		this.hno = hno;
		this.streetName = streetName;
		this.city = city;
		State = state;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}
	
	
}
