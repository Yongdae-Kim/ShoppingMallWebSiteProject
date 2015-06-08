package com.jejuuniv.smp.model;

public class UserRole {
	public enum Role {
		ROLE_ADMIN, ROLE_USER
	}

	private String name;
	private Role role;

	public UserRole() {
		super();
	}

	public UserRole(String name, Role role) {
		super();
		this.name = name;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}