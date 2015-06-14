package com.jejuuniv.smp.service.file;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

	File uploadFile(MultipartFile uploadfile, String path);

	void deleteFile(String path);

}
