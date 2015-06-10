package com.jejuuniv.smp.service.cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.model.UserCart;
import com.jejuuniv.smp.repository.user_cart.UserCartDao;

@Service
public class CartServiceImpl implements CartService {
	@Autowired
	private UserCartDao userCartDao;

	@Override
	public void addProduct(String userName, long productId) {
		UserCart userCart = new UserCart();
		userCart.setUserName(userName);
		userCart.setProductId(productId);

		userCartDao.insertUsersProduct(userCart);
	}

	@Override
	public List<Product> findProducts(String userName) {
		return userCartDao.findUsersProducstByName(userName);
	}

	@Override
	public int isExistedProduct(long productId) {
		return userCartDao.isExistedUsersProduct(productId);
	}

}
