package com.jejuuniv.smp.repository.user_roles;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.jejuuniv.smp.model.UserRole;

public class UserRoleDaoImpl implements UserRoleDao {

	@Autowired
	private SqlSession sqlSession;

	public UserRoleDaoImpl() {
		super();
	}

	@Override
	public UserRole findUserRoleByName(String name) {
		return sqlSession.<UserRole> selectOne("findUserRoleByName", name);
	}

	@Override
	public void insertUserRole(UserRole userRole) {
		sqlSession.insert("insertUserRole", userRole);
	}

	@Override
	public void deleteUserRole(String name) {
		sqlSession.delete("deleteUserRole", name);
	}

	@Override
	public List<UserRole> findAllUserRoles() {
		return sqlSession.<UserRole> selectList("findAllUserRoles");
	}

	@Override
	public int hasUserRole(String name) {
		return sqlSession.selectOne("hasUserRole", name);
	}
}
