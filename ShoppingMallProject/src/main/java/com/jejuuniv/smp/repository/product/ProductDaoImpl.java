package com.jejuuniv.smp.repository.product;

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
	public Product findById(String id) {
		return sqlSession.<Product> selectOne("findById", id);
	}

	@Override
	public void insert(Product product) {
		sqlSession.insert("insert", product);
	}

	@Override
	public void delete(String id) {
		sqlSession.delete("delete", id);
	}

	@Override
	public List<Product> findAll() {
		return sqlSession.<Product> selectList("findAll");
	}

}
