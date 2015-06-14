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
	public void addProduct(UserCart userCart) {
		userCartDao.insertUsersProduct(userCart);
	}

	@Override
	public List<Product> findProducts(String userId) {
		return userCartDao.findUsersProducstByUserId(userId);
	}

	@Override
	public boolean isExistedProduct(String userId, long productId) {

		boolean isExistedProduct = false;

		List<Product> products = userCartDao.findUsersProducstByUserId(userId);

		for (Product product : products) {
			if (productId == product.getId()) {
				isExistedProduct = true;
				break;
			}
		}
		return isExistedProduct;
	}

	@Override
	public void deleteProduct(long productId) {
		userCartDao.deleteUsersProduct(productId);
	}
}
