package com.jejuuniv.smp.model;

import org.springframework.web.multipart.MultipartFile;

public class Product {

	private long id;

	private String img;

	private MultipartFile imgFile;

	private String name;
	private String description;

	private int price;

	private String date;
	private String seller;

	public Product() {
		super();
	}

	public Product(String img, String name, String description, int price,
			String date, String seller) {
		super();
		this.img = img;
		this.name = name;
		this.description = description;
		this.price = price;
		this.date = date;
		this.seller = seller;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public MultipartFile getImgFile() {
		return imgFile;
	}

	public void setImgFile(MultipartFile imgFile) {
		this.imgFile = imgFile;
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
