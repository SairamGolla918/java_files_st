package com.spring.springdemo.beans;

import java.util.Map;
//import java.util.List;
import java.util.Set;

public class State 
{
	private String stateName;
	private String countryName;
	private Map<String,String> cities;
	
	public State(){}

	public State(String stateName, String countryName, Map<String,String> cities) {
		super();
		this.stateName = stateName;
		this.countryName = countryName;
		this.cities = cities;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Map<String,String> getCities() {
		return cities;
	}

	public void setCities(Map<String,String> cities) {
		this.cities = cities;
	}
	
	
	

}
