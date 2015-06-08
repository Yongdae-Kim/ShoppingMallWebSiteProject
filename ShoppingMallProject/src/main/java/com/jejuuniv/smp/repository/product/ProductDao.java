package com.jejuuniv.smp.repository.product;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jejuuniv.smp.model.Product;

@Repository
public interface ProductDao {
	public abstract Product findProductById(long id);

	public abstract void insertProduct(Product product);

	public abstract void deleteProduct(long id);

	public abstract List<Product> findAllProducts();
}
