package com.jejuuniv.smp;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.repository.product.ProductDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class ProductDaoTest {

	private String id;

	private String img;
	private String name;
	private String description;
	private int price;
	private String date;
	private String seller;

	@Autowired
	private ProductDao productDao;

	@Before
	public void setup() {
		id = String.valueOf(new Random().nextInt());

		img = "test";
		name = "키보드";
		description = "기계식키보드";
		price = 100000;

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		date = dateFormat.format(new Date());

		seller = "scratchback";
	}

	@Test
	public void add() {

		Product product = new Product(id, img, name, description, price, date,
				seller);

		productDao.insert(product);

		Product addedProduct = productDao.findById(id);

		assertEquals(id, addedProduct.getId());
		assertEquals(img, addedProduct.getImg());
		assertEquals(description, addedProduct.getDescription());
		assertEquals(price, addedProduct.getPrice());
		assertEquals(date, addedProduct.getDate());
		assertEquals(seller, addedProduct.getSeller());

	}

	@Test
	public void getOne() {

		String id = "-990630615";

		Product product = productDao.findById(id);

		assertEquals(id, product.getId());
		assertEquals(img, product.getImg());
		assertEquals(description, product.getDescription());
		assertEquals(price, product.getPrice());
		// assertEquals(date, product.getDate());
		assertEquals(seller, product.getSeller());
	}

	@Test
	public void getAll() {
		List<Product> products = productDao.findAll();
		for (Product product : products) {
			System.out.println(product.getId());
		}
	}

	@Test
	public void delete() {

		Product product = new Product(id, img, name, description, price, date,
				seller);

		productDao.insert(product);

		productDao.delete(id);

		Product deletedUser = productDao.findById(id);

		assertNull(deletedUser);
	}
}
