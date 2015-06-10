package com.jejuuniv.smp.model;

public class UserCart {

	private String userName;
	private long productId;

	public UserCart() {
		super();
	}

	public UserCart(String userName, long productId) {
		super();
		this.userName = userName;
		this.productId = productId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

}
