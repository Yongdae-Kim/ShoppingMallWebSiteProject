package com.jejuuniv.smp.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jejuuniv.smp.model.User;
import com.jejuuniv.smp.model.UserRole;
import com.jejuuniv.smp.model.UserRole.Role;
import com.jejuuniv.smp.repository.user_roles.UserRoleDao;
import com.jejuuniv.smp.repository.users.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private UserRoleDao userRoleDao;

	@Override
	public User findUser(User user) {
		User selectedUser = null;
		if (userDao.isMatchedUser(user) >= 1) {
			selectedUser = userDao.findUserByName(user.getName());
		}
		return selectedUser;
	}

	@Override
	public boolean addUser(User user) {
		boolean isUserAdded = false;

		if (userDao.findUserByName(user.getName()) == null) {
			userDao.insertUser(user);
			UserRole userRole = new UserRole(user.getName(), Role.ROLE_USER);
			userRoleDao.insertUserRole(userRole);
			isUserAdded = true;
		} else {
			isUserAdded = false;
		}
		return isUserAdded;
	}

	@Override
	public void resetUser(User user) {
		userDao.updateUser(user);
	}
}
