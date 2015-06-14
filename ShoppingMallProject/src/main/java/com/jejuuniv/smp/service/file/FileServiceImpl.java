package com.jejuuniv.smp.service.file;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileServiceImpl implements FileService {

	@Override
	public File uploadFile(MultipartFile multipartFile, String path) {

		String fileName = System.currentTimeMillis()
				+ multipartFile.getOriginalFilename();

		File uploadDir = new File(path);

		if (!uploadDir.exists()) {
			uploadDir.mkdirs();
		}

		File uploadFile = new File(uploadDir, fileName);

		try {
			multipartFile.transferTo(uploadFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return uploadFile;
	}

	@Override
	public void deleteFile(String path) {
		File file = new File(path);
		if (file.exists()) {
			file.delete();
		} else {
			System.out.println("not found");
		}
	}
}
