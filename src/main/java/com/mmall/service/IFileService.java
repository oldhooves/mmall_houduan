package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by ${laotizi} on 2018-04-23.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
