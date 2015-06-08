package com.jejuuniv.smp.repository.user_basket;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.jejuuniv.smp.model.UserBasket;

public class UserBasketDaoImpl implements UserBasketDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<String> findUsersProductIds(String userName) {
		return sqlSession.<String> selectList("findUsersProductIds");
	}

	@Override
	public void insertUsersProduct(UserBasket userBasket) {
		sqlSession.insert("insertUsersProduct", userBasket);
	}

	@Override
	public void deleteUsersProduct(long productId) {
		sqlSession.delete("deleteUsersProduct", productId);

	}

	@Override
	public int isExistedUsersProduct(long productId) {
		return sqlSession.selectOne("isExistedUsersProduct", productId);
	}
}
