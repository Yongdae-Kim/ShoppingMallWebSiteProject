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

import com.jejuuniv.smp.model.User;
import com.jejuuniv.smp.repository.users.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class UserDaoTest {

	@Autowired
	private UserDao userDao;

	@Test
	public void isExistedUserTesting() {

//		String name = "scratchback@hanmail.net";
//
//		int userCount = userDao.isExistedId(name);
//		boolean isExisted;
//
//		if (userCount >= 1) {
//			isExisted = true;
//		} else {
//			isExisted = false;
//		}
//
//		assertTrue(isExisted);
	}

	@Test
	public void insertUserTesting() throws Exception {

//		String name = "scratchback@hanmail.net";
//		String password = "123";
//
//		if (!(userDao.isExistedId(name) >= 1)) {
//			User user = new User();
//			user.setName(name);
//			user.setPassword(password);
//			userDao.insertUser(user);
//
//			User addedUser = userDao.findUserById(name);
//
//			assertEquals(name, addedUser.getName());
//			assertEquals(password, addedUser.getPassword());
//		}
	}

	@Test
	public void findUserByNameTesting() throws Exception {

//		String name = "scratchback@hanmail.net";
//		String password = "123";
//
//		User user = userDao.findUserById(name);
//
//		assertEquals(name, user.getName());
//		assertEquals(password, user.getPassword());
	}

	@Test
	public void findAllUsersTesting() {
//		List<User> users = userDao.findAllUsers();
//		for (User user : users) {
//			System.out.println(user.getName());
//		}
//		assertTrue(users.size() > 0);
	}

	@Test
	public void deleteUserTesting() {

//		String name = "test@hanmail.net";
//		String password = "123";
//
//		User user = new User();
//		user.setName(name);
//		user.setPassword(password);
//
//		userDao.insertUser(user);
//
//		userDao.deleteUser(name);
//		User deletedUser = userDao.findUserById(name);
//		assertNull(deletedUser);
	}
}
