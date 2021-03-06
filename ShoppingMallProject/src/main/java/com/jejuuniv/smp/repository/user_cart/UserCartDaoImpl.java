package com.jejuuniv.smp.repository.user_cart;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.model.UserCart;

public class UserCartDaoImpl implements UserCartDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Product> findUsersProducstByUserId(String userId) {
		return sqlSession.<Product> selectList("findUsersProducstByUserId");
	}

	@Override
	public void insertUsersProduct(UserCart userCart) {
		sqlSession.insert("insertUsersProduct", userCart);
	}

	@Override
	public void deleteUsersProduct(long productId) {
		sqlSession.delete("deleteUsersProduct", productId);

	}
}
