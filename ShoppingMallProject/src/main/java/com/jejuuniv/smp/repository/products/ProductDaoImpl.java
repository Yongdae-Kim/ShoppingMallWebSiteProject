package com.jejuuniv.smp.repository.products;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.jejuuniv.smp.model.Product;

public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SqlSession sqlSession;

	public ProductDaoImpl() {
		super();
	}

	@Override
	public Product findProductById(long id) {
		return sqlSession.<Product> selectOne("findProductById", id);
	}

	@Override
	public void insertProduct(Product product) {
		sqlSession.insert("insertProduct", product);
	}

	@Override
	public void deleteProduct(long id) {
		sqlSession.delete("deleteProduct", id);
	}

	@Override
	public List<Product> findAllProducts() {
		return sqlSession.<Product> selectList("findAllProducts");
	}

	// @Override
	// public List<Product> findProductByName(String name) {
	// return sqlSession.<Product> selectList("findProductsByName");
	// }

	@Override
	public Product findLatestProduct() {
		return sqlSession.selectOne("findLatestProduct");
	}

	@Override
	public void updateProduct(Product product) {
		sqlSession.update("updateProduct", product);

	}
}
