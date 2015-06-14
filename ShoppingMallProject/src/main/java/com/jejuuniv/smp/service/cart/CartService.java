package com.jejuuniv.smp.service.cart;

import java.util.List;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.model.UserCart;

public interface CartService {
	void addProduct(UserCart userCart);

	List<Product> findProducts(String name);

	boolean isExistedProduct(String userName, long productId);

	void deleteProduct(long productId);

}
