package com.jejuuniv.smp.service.user;

import com.jejuuniv.smp.model.User;

public interface UserService {
	User findUser(User user);

	boolean addUser(User user);

	void resetUser(User user);
}
