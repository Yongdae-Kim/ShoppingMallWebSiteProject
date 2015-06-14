package com.jejuuniv.smp.service.product;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.jejuuniv.smp.model.Product;

public interface ProductService {

	Product findProduct(long id);

	List<Product> productList();

	void registeProduct(Product product, HttpSession session);

	Product getLatestProduct();

}
