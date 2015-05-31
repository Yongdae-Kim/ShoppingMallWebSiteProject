package com.jejuuniv.smp.repository.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jejuuniv.smp.model.User;

@Repository
public interface UserDao {
	public abstract User findById(String id);

	public abstract void insert(User user);

	public abstract void delete(String id);

	public abstract List<User> findAll();
}
