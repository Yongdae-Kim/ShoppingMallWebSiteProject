package com.jejuuniv.smp.service.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.repository.products.ProductDao;
import com.jejuuniv.smp.service.file.FileUploadService;
import com.jejuuniv.smp.util.CurrentTime;

@Service
public class RegisteProductServiceImpl implements RegisteProductService {
	@Autowired
	private ProductDao productDao;

	@Autowired
	private FileUploadService fileUploadService;

	@Override
	public void addProduct(Product product) {

		MultipartFile uploadfile = product.getImgFile();
		String fileName = null;

		if (uploadfile != null) {
			fileName = System.currentTimeMillis()
					+ uploadfile.getOriginalFilename();
			fileUploadService.uploadFile(uploadfile, fileName);
		}

		product.setImg(fileName);
		product.setDate(CurrentTime.getNow());
		productDao.insertProduct(product);
	}
}
