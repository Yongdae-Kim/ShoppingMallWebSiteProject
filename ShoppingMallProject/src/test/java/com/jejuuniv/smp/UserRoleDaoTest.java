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
import com.jejuuniv.smp.repository.userrole.UserRoleDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class UserRoleDaoTest {

	@Autowired
	private UserRoleDao userRoleDao;

	@Test
	public void add() throws Exception {

		String name = "kyd";
		Role role = Role.ROLE_ADMIN;

		if (!(userRoleDao.isExistedUserRole(name) >= 1)) {
			UserRole userRole = new UserRole(name, role);

			userRoleDao.insertUserRole(userRole);

			UserRole addedUserRole = userRoleDao.findUserRoleById(name);

			assertEquals(name, addedUserRole.getName());
			assertEquals(role, addedUserRole.getRole());
		}
	}

	@Test
	public void getOne() throws Exception {

		String name = "kyd";
		Role role = Role.ROLE_ADMIN;

		UserRole userRole = userRoleDao.findUserRoleById(name);

		assertEquals(name, userRole.getName());
		assertEquals(role, userRole.getRole());
	}

	@Test
	public void getAll() {
		List<UserRole> userRoles = userRoleDao.findAllUserRoles();
		assertTrue(userRoles.size() > 0);
	}

	@Test
	public void delete() {

		String name = "hkj";
		Role role = Role.ROLE_USER;

		UserRole userRole = new UserRole(name, role);

		userRoleDao.insertUserRole(userRole);

		userRoleDao.deleteUserRole(name);

		UserRole deletedUserRole = userRoleDao.findUserRoleById(name);
		assertNull(deletedUserRole);
	}
}
