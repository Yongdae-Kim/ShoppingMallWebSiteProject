package com.jejuuniv.smp.repository.products;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jejuuniv.smp.model.Product;

@Repository
public interface ProductDao {
	Product findProductById(long id);

	void insertProduct(Product product);

	void deleteProduct(long id);

	List<Product> findAllProducts();
}
