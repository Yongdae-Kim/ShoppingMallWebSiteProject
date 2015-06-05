package com.jejuuniv.smp.repository.product;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jejuuniv.smp.model.Product;

@Repository
public interface ProductDao {
	public abstract Product findById(long id);

	public abstract void insert(Product product);

	public abstract void delete(long id);

	public abstract List<Product> findAll();
}
