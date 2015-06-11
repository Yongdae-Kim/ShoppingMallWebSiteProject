package com.jejuuniv.smp;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.model.UserCart;
import com.jejuuniv.smp.repository.user_cart.UserCartDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class UserCartDaoTest {

	@Autowired
	private UserCartDao userCartDao;

	@Before
	public void setup() {
	}

	@Test
	public void insertUsersProductTesting() {

	}

	@Test
	public void deleteUsersProductTesting() {
		String userName = "scratchback@hanmail.net";
		long productId = 4;

		UserCart userCart = new UserCart(userName, productId);
		userCartDao.insertUsersProduct(userCart);

		userCartDao.deleteUsersProduct(productId);

		List<Product> usersProducts = userCartDao
				.findUsersProducstByName(userName);

		for (Product product : usersProducts) {
			System.out.println(product.getName());
		}

	}
}
