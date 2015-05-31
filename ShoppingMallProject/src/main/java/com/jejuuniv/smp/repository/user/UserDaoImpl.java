package com.jejuuniv.smp.repository.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.jejuuniv.smp.model.User;

public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSession sqlSession;

	public UserDaoImpl() {
		super();
	}

	@Override
	public User findById(String id) {
		return sqlSession.<User> selectOne("findById", id);
	}

	@Override
	public void insert(User user) {
		sqlSession.insert("insert", user);
	}

	@Override
	public void delete(String id) {
		sqlSession.delete("delete", id);
	}

	@Override
	public List<User> findAll() {
		return sqlSession.<User> selectList("findAll");
	}
}
