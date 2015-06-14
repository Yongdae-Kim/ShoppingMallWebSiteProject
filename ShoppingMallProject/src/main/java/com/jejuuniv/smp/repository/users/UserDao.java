package com.jejuuniv.smp.repository.users;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jejuuniv.smp.model.User;

@Repository
public interface UserDao {
	User findUserById(String id);

	void insertUser(User user);

	void deleteUser(String id);

	List<User> findAllUsers();

	int isExistedId(String id);

	int isMatchedUser(User user);

	void updateUser(User user);
}
