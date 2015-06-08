package com.jejuuniv.smp;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jejuuniv.smp.model.UserBasket;
import com.jejuuniv.smp.repository.user_basket.UserBasketDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class UserBasketDaoTest {

	@Autowired
	private UserBasketDao userBasketDao;

	@Before
	public void setup() {
	}

	@Test
	public void insertUsersProductTesting() {

		String userName = "scratchback@hanmail.net";
		long productId = 3;

		if (!(userBasketDao.isExistedUsersProduct(productId) >= 1)) {
			UserBasket userBasket = new UserBasket(userName, productId);
			userBasketDao.insertUsersProduct(userBasket);

			List<String> usersProductIds = userBasketDao
					.findUsersProductIds(userName);

			for (String id : usersProductIds) {
				assertEquals(id, productId);
			}
		}
	}

	@Test
	public void deleteUsersProductTesting() {
		String userName = "scratchback@hanmail.net";
		long productId = 4;

		UserBasket userBasket = new UserBasket(userName, productId);
		userBasketDao.insertUsersProduct(userBasket);

		userBasketDao.deleteUsersProduct(productId);

		List<String> usersProductIds = userBasketDao
				.findUsersProductIds(userName);

		for (String id : usersProductIds) {
			assertFalse(id.equals(4));
		}
	}
}
