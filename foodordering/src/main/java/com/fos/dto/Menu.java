package com.fos.dto;

public class Menu 
{
	String itemId;
	String itemName;
	double price;
	int restaurantId;
	int categoryId;
	public Menu(){}
	public Menu(String itemId, String itemName, double price, int restaurantId, int categoryId) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.restaurantId = restaurantId;
		this.categoryId = categoryId;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	};
	
	
	

}
