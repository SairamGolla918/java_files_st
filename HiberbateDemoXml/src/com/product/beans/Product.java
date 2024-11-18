package com.product.beans;

public class Product{
	
	private int productId;
	private String productName;
	private double productPrice;
	private double discount;
	
	public Product(int productId, String productName, double productPrice, double discount) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.discount = discount;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}


}
