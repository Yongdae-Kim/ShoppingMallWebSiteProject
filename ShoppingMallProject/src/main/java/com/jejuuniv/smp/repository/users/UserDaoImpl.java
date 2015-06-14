package com.jejuuniv.smp.repository.users;

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
	public User findUserById(String id) {
		return sqlSession.<User> selectOne("findUserById", id);
	}

	@Override
	public void insertUser(User user) {
		sqlSession.insert("insertUser", user);
	}

	@Override
	public void deleteUser(String name) {
		sqlSession.delete("deleteUser", name);
	}

	@Override
	public List<User> findAllUsers() {
		return sqlSession.<User> selectList("findAllUsers");
	}

	@Override
	public int isExistedId(String id) {
		return sqlSession.selectOne("isExistedUserId", id);
	}

	@Override
	public int isMatchedUser(User user) {
		return sqlSession.selectOne("isMatchedUser", user);
	}

	@Override
	public void updateUser(User user) {
		sqlSession.update("updateUser", user);
	}
}
