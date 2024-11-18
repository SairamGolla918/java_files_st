package com.gsr.bean;

import java.sql.Date;

public class Purchases {

	private String username;
	private String Product_Name;
	private Date purchase_date;
	private double amount;
	public Purchases() {
		// TODO Auto-generated constructor stub
	}
	public Purchases(String username,String Product_Name ,Date purchase_date, double amount) {
		super();
		this.username = username;
		this.Product_Name=Product_Name;
		this.purchase_date = purchase_date;
		this.amount = amount;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public Date getPurchase_date() {
		return purchase_date;
	}
	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

}
