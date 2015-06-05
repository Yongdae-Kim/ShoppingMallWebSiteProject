package com.jejuuniv.smp.model;

import java.util.Date;

public class Product {

	private String id;

	private String img;

	private String name;
	private String description;

	private int price;

	private String date;
	private String seller;

	public Product() {
		super();
	}

	public Product(String id, String img, String name, String description,
			int price, String date, String seller) {
		super();
		this.id = id;
		this.img = img;
		this.name = name;
		this.description = description;
		this.price = price;
		this.date = date;
		this.seller = seller;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

}
