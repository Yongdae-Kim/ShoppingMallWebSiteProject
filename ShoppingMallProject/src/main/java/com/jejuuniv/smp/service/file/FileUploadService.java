package com.jejuuniv.smp.service.file;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {

	String uploadFile(MultipartFile uploadfile, String path);
}
