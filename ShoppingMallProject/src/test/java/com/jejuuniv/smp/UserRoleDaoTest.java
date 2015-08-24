package com.jejuuniv.smp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jejuuniv.smp.model.UserRole;
import com.jejuuniv.smp.model.UserRole.Role;
import com.jejuuniv.smp.repository.user_roles.UserRoleDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class UserRoleDaoTest {

	@Autowired
	private UserRoleDao userRoleDao;

	@Test
	public void insertUserRoleTesting() throws Exception {

//		String name = "scratchback@hanmail.net";
//		Role role = Role.ROLE_USER;
//
//		if (!(userRoleDao.hasUserRole(name) >= 1)) {
//			UserRole userRole = new UserRole(name, role);
//
//			userRoleDao.insertUserRole(userRole);
//
//			UserRole addedUserRole = userRoleDao.findUserRoleByName(name);
//
//			assertEquals(name, addedUserRole.getUserId());
//			assertEquals(role, addedUserRole.getRole());
//		}
	}

	@Test
	public void findUserRoleByNameTesting() throws Exception {

//		String name = "scratchback@hanmail.net";
//		Role role = Role.ROLE_USER;
//
//		UserRole userRole = userRoleDao.findUserRoleByName(name);
//
//		assertEquals(role, userRole.getRole());
	}

	@Test
	public void findAllUserRolesTesting() {
//		List<UserRole> userRoles = userRoleDao.findAllUserRoles();
//		for (UserRole userRole : userRoles) {
//			System.out.println(userRole.getRole());
//		}
//		assertTrue(userRoles.size() > 0);
	}

	@Test
	public void deleteUserRoleTesting() {

//		String name = "test@hanmail.net";
//		Role role = Role.ROLE_ADMIN;
//
//		UserRole userRole = new UserRole(name, role);
//		userRoleDao.insertUserRole(userRole);
//
//		userRoleDao.deleteUserRole(name);
//
//		UserRole deletedUserRole = userRoleDao.findUserRoleByName(name);
//		assertNull(deletedUserRole);
	}
}
