package com.spring.springdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

//@Component
@Service
public class Customer 
{
	private int CustomerNo=8001;
	private String CustomerName="Saiee Yadav";
	private Long mobileNo=8009000199L;
	
	@Autowired(required = false)
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
