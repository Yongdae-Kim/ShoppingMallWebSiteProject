package com.jejuuniv.smp.service.user;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.model.User;

public interface BasketService {
	User saveProduct(User user, Product product);

}
