package com.jejuuniv.smp.service.product;

import java.util.List;

import com.jejuuniv.smp.model.Product;

public interface ProductService {
	List<Product> productList();

	void registeProduct(Product product, String path);

	Product getNewProduct();

}
