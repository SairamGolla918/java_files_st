package com.gsr.bean;

public class Product 
{
	private int productId;
	private String productName;
	private String product_desc;
	private double productPrice;
	
	public Product(){}
	
	public Product(int productId, String productName, String product_desc, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.product_desc = product_desc;
		this.productPrice = productPrice;
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

	public String getproduct_desc() {
		return product_desc;
	}

	public void setProduct_desc(String productDesctription) {
		this.product_desc = productDesctription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
	
	
}
