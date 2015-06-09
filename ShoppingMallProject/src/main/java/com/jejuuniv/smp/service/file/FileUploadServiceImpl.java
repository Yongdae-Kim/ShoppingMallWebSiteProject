package com.jejuuniv.smp.service.file;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadServiceImpl implements FileUploadService {

	@Override
	public void uploadFile(MultipartFile multipartFile, String fileName) {
		try {

			File uploadDir = new File("C:/UploadFiles/");

			if (!uploadDir.exists()) {
				uploadDir.mkdirs();
			}

			File file = new File(uploadDir, fileName);

			multipartFile.transferTo(file);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
