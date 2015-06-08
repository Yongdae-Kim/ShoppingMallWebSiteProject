package com.jejuuniv.smp.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jejuuniv.smp.model.User;
import com.jejuuniv.smp.model.UserRole;
import com.jejuuniv.smp.model.UserRole.Role;
import com.jejuuniv.smp.repository.user.UserDao;
import com.jejuuniv.smp.repository.userrole.UserRoleDao;

@Service
public class SignupServiceImpl implements SignupService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private UserRoleDao userRoleDao;

	@Override
	public boolean addUser(User user) {
		boolean isUserAdded = false;

		if (userDao.findUserById(user.getName()) == null) {
			userDao.insertUser(user);
			UserRole userRole = new UserRole(user.getName(), Role.ROLE_USER);
			userRoleDao.insertUserRole(userRole);
			isUserAdded = true;
		} else {
			isUserAdded = false;
		}
		return isUserAdded;
	}
}
