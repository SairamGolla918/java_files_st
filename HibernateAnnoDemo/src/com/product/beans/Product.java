package com.product.beans;

import javax.persistence.*;

//import org.hibernate.annotations.Entity;


@Entity
@Table(name="Product_Table")
public class Product
{
	@Id
	@GeneratedValue
	@Column(name="Product_Id")
	private int id;
	
	@Column(name="Product_Name")
	private String name;
	
	@Column(name="Product_Price")
	private double price;
	
	@Column(name="Product_Discount")
	private double discount;
	
	public Product(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	
	
	

}
