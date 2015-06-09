package com.jejuuniv.smp.service.file;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadServiceImpl implements FileUploadService {

	@Override
	public String uploadFile(MultipartFile multipartFile, String path) {

		String fileName = getDetatilPath() + System.currentTimeMillis()
				+ multipartFile.getOriginalFilename();

		File uploadDir = new File(path);

		if (!uploadDir.exists()) {
			uploadDir.mkdirs();
		}

		File file = new File(uploadDir, fileName);

		try {
			multipartFile.transferTo(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return fileName;
	}

	private String getDetatilPath() {
		return "resources" + File.separator + "upload" + File.separator;
	}
}
