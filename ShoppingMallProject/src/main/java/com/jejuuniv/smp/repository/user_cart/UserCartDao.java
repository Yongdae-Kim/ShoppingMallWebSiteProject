package com.jejuuniv.smp.repository.user_cart;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.model.UserCart;

@Repository
public interface UserCartDao {
	List<Product> findUsersProducstByName(String userName);

	void deleteUsersProduct(long productId);

	void insertUsersProduct(UserCart userCart);

	int isExistedUsersProduct(long productId);
}
