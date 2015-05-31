package com.jejuuniv.smp.model;

public class Product {

	private String name;
	private String description;
	private String price;
	private String date;

	public Product() {
		super();
	}

	public Product(String name, String description, String price, String date) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
