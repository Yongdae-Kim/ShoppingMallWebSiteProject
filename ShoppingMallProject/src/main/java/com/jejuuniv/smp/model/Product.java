package com.jejuuniv.smp.model;

import org.springframework.web.multipart.MultipartFile;

public class Product {

	private long id;

	private MultipartFile imgFile;
	private String imgPath;
	private String uploadImgPath;

	private String name;
	private String description;

	private int price;

	private String date;
	private String seller;

	public Product() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public MultipartFile getImgFile() {
		return imgFile;
	}

	public void setImgFile(MultipartFile imgFile) {
		this.imgFile = imgFile;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String img) {
		this.imgPath = img;
	}

	public String getUploadImgPath() {
		return uploadImgPath;
	}

	public void setUploadImgPath(String uploadImgPath) {
		this.uploadImgPath = uploadImgPath;
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

	@Override
	public String toString() {
		return "Product [id=" + id + ", imgPath=" + imgPath
				+ ", uploadImgPath=" + uploadImgPath + ", name=" + name
				+ ", description=" + description + ", price=" + price
				+ ", date=" + date + ", seller=" + seller + "]";
	}
}
