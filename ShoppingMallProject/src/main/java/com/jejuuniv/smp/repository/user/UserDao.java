package com.jejuuniv.smp.repository.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jejuuniv.smp.model.User;

@Repository
public interface UserDao {
	public abstract User findUserById(String name);

	public abstract void insertUser(User user);

	public abstract void deleteUser(String id);

	public abstract List<User> findAllUsers();

	public abstract int isExistedUser(String name);
}
