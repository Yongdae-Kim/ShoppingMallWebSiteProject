package com.jejuuniv.smp.repository.user_cart;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jejuuniv.smp.model.UserBasket;

@Repository
public interface UserCartDao {
	List<String> findUsersProductIds(String userName);

	void deleteUsersProduct(long productId);

	void insertUsersProduct(UserBasket userBasket);

	int isExistedUsersProduct(long productId);
}
