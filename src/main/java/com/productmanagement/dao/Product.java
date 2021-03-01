package com.productmanagement.dao;

import java.util.Map;

public class Product {

	String name;
	String price;
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Map<String, Integer> getQuantity() {
		return quantity;
	}

	public void setQuantity(Map<String, Integer> quantity) {
		this.quantity = quantity;
	}

	public String getImageLocation() {
		return imageLocation;
	}

	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	Map<String, Integer> quantity;
	String imageLocation;
}
