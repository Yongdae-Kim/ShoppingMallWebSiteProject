package com.jejuuniv.smp.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jejuuniv.smp.model.User;
import com.jejuuniv.smp.repository.user.UserDao;
import com.jejuuniv.smp.repository.userrole.UserRoleDao;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private UserRoleDao userRoleDao;

	@Override
	public User findUser(User user) {
		User selectedUser = null;
		if (userDao.isMatchedUser(user) >= 1) {

			selectedUser = userDao.findUserById(user.getName());

			System.out.println(selectedUser.getName());
			System.out.println(selectedUser.getPassword());

		}
		return selectedUser;
	}
}
