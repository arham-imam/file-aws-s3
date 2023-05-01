package com.example.fileawss3.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileServiceImplementation {
    String uploadFile(MultipartFile file);

    byte[] downloadFile(String fileName);

    String deleteFile(String fileName);

    List<String> listAllFiles();
}
