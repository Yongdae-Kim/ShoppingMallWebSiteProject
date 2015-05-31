package com.jejuuniv.smp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.model.User;
import com.jejuuniv.smp.repository.user.UserDao;

@Service
public class ProductListServiceImpl implements ProductListService {
	@Autowired
	private UserDao userDao;

	@Override
	public List<Product> list() {

		List<Product> list = new ArrayList<Product>();

		// 임시로 데이터베이스의 유저데이터를 가지고 실행
		User user = userDao.findById("1");

		for (int i = 0; i < 50; i++) {
			list.add(new Product("" + i, user.getPassword(), user.getId(), user
					.getId(), user.getId(), user.getName(), user.getPassword()));
		}
		return list;
	}
}
