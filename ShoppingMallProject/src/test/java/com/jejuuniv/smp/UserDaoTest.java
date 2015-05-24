package com.jejuuniv.smp;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jejuuniv.smp.model.User;
import com.jejuuniv.smp.model.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "daoFactory.xml")
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
	public void get() throws SQLException, ClassNotFoundException {
		String id = "1";
		User user = userDao.get(id);
		assertEquals(id, user.getId());
		assertEquals(name, user.getName());
		assertEquals(password, user.getPassword());
	}

	@Test
	public void add() throws ClassNotFoundException, SQLException {
		String id = String.valueOf(new Random().nextInt());
		User user = new User(id, name, password);

		user.setId(id);
		user.setName(name);
		user.setPassword(password);
		userDao.add(user);
		User addedUser = userDao.get(id);
		assertEquals(id, addedUser.getId());
		assertEquals(name, addedUser.getName());
		assertEquals(password, addedUser.getPassword());
	}

	@Test
	public void delete() throws SQLException {
		String id = String.valueOf(new Random().nextInt());
		User user = new User(id, name, password);

		user.setId(id);
		user.setName(name);
		user.setPassword(password);
		userDao.add(user);

		userDao.delete(id);
		User deletedUser = userDao.get(id);
		assertNull(deletedUser);
	}

	@Test
	public void findAll() {
		List<User> users = userDao.findAll();
		assertTrue(users.size() > 0);
	}
}
