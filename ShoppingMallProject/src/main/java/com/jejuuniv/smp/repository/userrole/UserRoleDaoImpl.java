package com.jejuuniv.smp.repository.userrole;

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
	public UserRole findUserRoleById(String name) {
		return sqlSession.<UserRole> selectOne("findUserRoleById", name);
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
	public int isExistedUserRole(String name) {
		return sqlSession.selectOne("isExistedUserRole", name);
	}
}
