package com.jejuuniv.smp.model;

public class UserRole {
	public enum Role {
		ROLE_ADMIN, ROLE_USER
	}

	private long id;

	private String userId;
	private Role role;

	public UserRole() {
		super();
	}

	public UserRole(String userId, Role role) {
		super();
		this.userId = userId;
		this.role = role;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
