package com.jejuuniv.smp.model;

public class UserCart {

	private String userId;
	private long productId;

	public UserCart() {
		super();
	}

	public UserCart(String userId, long productId) {
		super();
		this.userId = userId;
		this.productId = productId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "UserCart [userId=" + userId + ", productId=" + productId + "]";
	}
}
