package com.jejuuniv.smp.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.repository.products.ProductDao;
import com.jejuuniv.smp.service.file.FileUploadService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;

	@Autowired
	private FileUploadService fileUploadService;

	@Override
	public List<Product> productList() {
		return productDao.findAllProducts();
	}

	@Override
	public void registeProduct(Product product, String path) {

		MultipartFile uploadfile = product.getImgFile();

		String imgPath = fileUploadService.uploadFile(uploadfile, path);

		product.setImg(imgPath);

		productDao.insertProduct(product);
	}
}
