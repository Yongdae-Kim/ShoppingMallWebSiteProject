package com.jejuuniv.smp.model;

public class Product {

	private String id;

	private String imgSrc;
	private String name;
	private String description;
	private String price;
	private String date;
	private String seller;

	public Product() {
		super();
	}

	public Product(String id, String imgSrc, String name, String description,
			String price, String date, String seller) {
		super();
		this.id = id;
		this.imgSrc = imgSrc;
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

	public String getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
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

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

}
