package com.productmanagement.dao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class ProductInventory {

	@Id
	public int id;
	@Column
	public String name;
	@Column
	public String price;
	@Column
	public String color;
	@Column
	public String imageLocation;

	@OneToMany
	@JoinColumn(name = "productId")
	private List<ProductQuantity> quantity;

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

	public List<ProductQuantity> getQuantity() {
		return quantity;
	}

	public void setQuantity(List<ProductQuantity> quantity) {
		this.quantity = quantity;
	}

}
