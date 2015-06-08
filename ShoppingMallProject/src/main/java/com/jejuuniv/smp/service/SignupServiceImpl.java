package com.jejuuniv.smp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jejuuniv.smp.model.User;
import com.jejuuniv.smp.repository.user.UserDao;

@Service
public class SignupServiceImpl implements SignupService {

	@Autowired
	private UserDao userDao;

	@Override
	public boolean addUser(User user) {
		boolean isInserted = false;

		if (userDao.findUserById(user.getName()) == null) {
			userDao.insertUser(user);
			isInserted = true;
		} else {
			isInserted = false;
		}
		return isInserted;
	}
}
