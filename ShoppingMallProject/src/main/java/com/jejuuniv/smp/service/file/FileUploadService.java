package com.jejuuniv.smp.service.file;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {
	void uploadFile(MultipartFile multipartFile, String fileName);
}
