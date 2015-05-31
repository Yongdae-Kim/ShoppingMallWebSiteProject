package com.jejuuniv.smp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Random;

import org.junit.Before;
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

	private String name;
	private String password;

	@Autowired
	private UserDao userDao;

	@Before
	public void setup() {
		name = "kim";
		password = "1111";
	}

	@Test
	public void add() {

		String id = String.valueOf(new Random().nextInt());

		User user = new User(id, name, password);
		user.setId(id);
		user.setName(name);
		user.setPassword(password);

		userDao.insert(user);

		User addedUser = userDao.findById(id);

		assertEquals(id, addedUser.getId());
		assertEquals(name, addedUser.getName());
		assertEquals(password, addedUser.getPassword());
	}

	@Test
	public void getOne() {

		String id = "1";
		User user = userDao.findById(id);

		assertEquals(id, user.getId());
		assertEquals(name, user.getName());
		assertEquals(password, user.getPassword());
	}

	@Test
	public void getAll() {
		List<User> users = userDao.findAll();
		assertTrue(users.size() > 0);
	}

	@Test
	public void delete() {
		String id = String.valueOf(new Random().nextInt());
		User user = new User(id, name, password);

		user.setId(id);
		user.setName(name);
		user.setPassword(password);
		userDao.insert(user);

		userDao.delete(id);
		User deletedUser = userDao.findById(id);
		assertNull(deletedUser);
	}

}
