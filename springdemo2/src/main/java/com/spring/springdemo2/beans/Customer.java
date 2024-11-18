package com.spring.springdemo2.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.springdemo2.beans.Address;

public class Customer {

	private int CustomerNo;
	private String CustomerName;
	private Long mobileNo;
	
	@Autowired
	private Address customerAddress;
	
	public Customer() {}

	public Customer(int customerNo, String customerName, Long mobileNo, Address customerAddress) {
		super();
		CustomerNo = customerNo;
		CustomerName = customerName;
		this.mobileNo = mobileNo;
		this.customerAddress = customerAddress;
	}
	
	
	public Customer(Address customerAddress) {
		super();
		this.customerAddress = customerAddress;
	}

	public int getCustomerNo() {
		return CustomerNo;
	}

	public void setCustomerNo(int customerNo) {
		CustomerNo = customerNo;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	
	


}
