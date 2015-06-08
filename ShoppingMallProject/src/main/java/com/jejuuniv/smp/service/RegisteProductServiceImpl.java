package com.jejuuniv.smp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.repository.product.ProductDao;

@Service
public class RegisteProductServiceImpl implements RegisteProductService {
	@Autowired
	private ProductDao productDao;

	@Override
	public void addProduct(Product product) {
		productDao.insertProduct(product);
	}
}
