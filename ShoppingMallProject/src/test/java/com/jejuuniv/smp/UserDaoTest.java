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
import com.jejuuniv.smp.repository.user.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class UserDaoTest {

	@Autowired
	private UserDao userDao;

	@Test
	public void exist() {

		String name = "kyd";

		int userCount = userDao.isExistedUser(name);
		boolean isExisted;

		if (userCount >= 1) {
			isExisted = true;
		} else {
			isExisted = false;
		}

		assertEquals(true, isExisted);
	}

	@Test
	public void add() throws Exception {

		String name = "kyd";
		String password = "1111";

		if (!(userDao.isExistedUser(name) >= 1)) {
			User user = new User(name, password);
			userDao.insertUser(user);

			User addedUser = userDao.findUserById(name);

			assertEquals(name, addedUser.getName());
			assertEquals(password, addedUser.getPassword());
		}
	}

	@Test
	public void getOne() throws Exception {

		String name = "kyd";
		String password = "1111";

		User user = userDao.findUserById(name);

		assertEquals(name, user.getName());
		assertEquals(password, user.getPassword());
	}

	@Test
	public void getAll() {
		List<User> users = userDao.findAllUsers();
		assertTrue(users.size() > 0);
	}

	@Test
	public void delete() {

		String name = "hkj";
		String password = "1111";

		User user = new User(name, password);

		userDao.insertUser(user);

		userDao.deleteUser(name);
		User deletedUser = userDao.findUserById(name);
		assertNull(deletedUser);
	}
}
