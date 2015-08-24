package com.jejuuniv.smp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.repository.products.ProductDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class ProductDaoTest {

	@Autowired
	private ProductDao productDao;

	@Before
	public void setup() {
	}

	@Test
	public void insertProductTesting() {

//		long id = 100;
//
//		String img = "insert image";
//		String name = "insert name";
//		String description = "insert 1234";
//		int price = 1000;
//
//		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		String date = dateFormat.format(new Date());
//
//		String seller = "scratchback";
//
//		Product product = new Product();
//		product.setId(id);
//		product.setDate(date);
//		product.setImgPath(img);
//		product.setName(name);
//		product.setDescription(description);
//		product.setPrice(price);
//		product.setSeller(seller);
//
//		productDao.insertProduct(product);
//
//		Product addedProduct = productDao.findProductById(id);
//
//		assertEquals(id, addedProduct.getId());
//		assertEquals(img, addedProduct.getImgPath());
//		assertEquals(description, addedProduct.getDescription());
//		assertEquals(price, addedProduct.getPrice());
//		assertEquals(date, addedProduct.getDate());
//		assertEquals(seller, addedProduct.getSeller());
	}

	@Test
	public void findProductByIdTesting() {

		long id = 100;
//
//		String img = "insert image";
//		String name = "insert name";
//		String description = "insert 1234";
//		int price = 1000;
//
//		// DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		// String date = dateFormat.format(new Date());
//
//		String seller = "scratchback";
//
//		Product product = productDao.findProductById(id);
//
//		assertEquals(id, product.getId());
//		assertEquals(img, product.getImgPath());
//		assertEquals(name, product.getName());
//		assertEquals(description, product.getDescription());
//		assertEquals(price, product.getPrice());
//		// assertEquals(date, product.getDate());
//		assertEquals(seller, product.getSeller());
	}

	@Test
	public void findAllProductsTesting() {
//		List<Product> products = productDao.findAllProducts();
//		for (Product product : products) {
//			System.out.println(product.getId());
//		}
//		assertTrue(products.size() > 0);
	}

	@Test
	public void deleteProductTesting() {

//		long id = 200;
//
//		String img = "delete image";
//		String name = "delete name";
//		String description = "delete 1234";
//		int price = 2000;
//
//		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		String date = dateFormat.format(new Date());
//
//		String seller = "scratchback";
//
//		Product product = new Product();
//		product.setId(id);
//		product.setDate(date);
//		product.setImgPath(img);
//		product.setName(name);
//		product.setDescription(description);
//		product.setPrice(price);
//		product.setSeller(seller);
//
//		productDao.insertProduct(product);
//
//		productDao.deleteProduct(id);
//
//		Product deletedUser = productDao.findProductById(id);
//
//		assertNull(deletedUser);
	}
}
