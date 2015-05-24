package com.jejuuniv.smp.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSession sqlSession;

	public UserDaoImpl() {
		super();
	}

	@Override
	public User get(final String id) {
		return sqlSession.<User> selectOne("findById", id);
	}

	@Override
	public void add(final User user) {
		sqlSession.insert("insert", user);
	}

	@Override
	public void delete(final String id) {
		sqlSession.delete("delete", id);
	}

	@Override
	public List<User> findAll() {
		return sqlSession.<User> selectList("findAll");
	}
}
