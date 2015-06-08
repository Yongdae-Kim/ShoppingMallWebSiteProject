package com.jejuuniv.smp.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jejuuniv.smp.model.User;
import com.jejuuniv.smp.repository.users.UserDao;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserDao userDao;

	@Override
	public User findUser(User user) {
		User selectedUser = null;
		if (userDao.isMatchedUser(user) >= 1) {
			selectedUser = userDao.findUserByName(user.getName());
		}
		return selectedUser;
	}
}
