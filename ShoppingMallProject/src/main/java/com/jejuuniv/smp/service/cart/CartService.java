package com.jejuuniv.smp.service.cart;

import java.util.List;

import com.jejuuniv.smp.model.Product;

public interface CartService {
	void addProduct(String userName, long productId);

	List<Product> findProducts(String name);

	int isExistedProduct(long productId);
}
