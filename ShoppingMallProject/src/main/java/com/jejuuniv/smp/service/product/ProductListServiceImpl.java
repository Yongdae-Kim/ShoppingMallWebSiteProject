package com.jejuuniv.smp.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.repository.product.ProductDao;

@Service
public class ProductListServiceImpl implements ProductListService {
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> productList() {
		return productDao.findAllProducts();
	}
}
