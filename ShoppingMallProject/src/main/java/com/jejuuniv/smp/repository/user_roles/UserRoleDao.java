package com.jejuuniv.smp.repository.user_roles;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jejuuniv.smp.model.UserRole;

@Repository
public interface UserRoleDao {
	UserRole findUserRoleByName(String name);

	void insertUserRole(UserRole userRole);

	void deleteUserRole(String name);

	List<UserRole> findAllUserRoles();

	int hasUserRole(String name);

}
