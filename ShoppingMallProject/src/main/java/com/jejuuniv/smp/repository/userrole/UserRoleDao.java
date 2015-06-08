package com.jejuuniv.smp.repository.userrole;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jejuuniv.smp.model.UserRole;

@Repository
public interface UserRoleDao {
	public abstract UserRole findUserRoleById(String name);

	public abstract void insertUserRole(UserRole userRole);

	public abstract void deleteUserRole(String name);

	public abstract List<UserRole> findAllUserRoles();
	
	public abstract int isExistedUserRole(String name);
}
