package com.jejuuniv.smp.repository.users;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jejuuniv.smp.model.User;

@Repository
public interface UserDao {
	User findUserByName(String name);

	void insertUser(User user);

	void deleteUser(String id);

	List<User> findAllUsers();

	int isExistedUserName(String name);

	int isMatchedUser(User user);

	void updateUser(User user);
}
