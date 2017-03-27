package net.jonathanz.springboot.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import net.jonathanz.springboot.vo.FileVo;

public interface FileService {
    FileVo saveFile(MultipartFile file, FileVo metaData);
    List<FileVo> searchFileBy(String keyword);
}