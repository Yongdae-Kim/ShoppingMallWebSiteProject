package com.jejuuniv.smp.model;

public class UserBasket {

	private String userName;
	private long productId;

	public UserBasket() {
		super();
	}

	public UserBasket(String userName, long productId) {
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
