package com.example.demo.service;

import com.example.demo.model.Fileinfo;

public interface FileService {
	void addFileInfoData(Fileinfo fileInfo);

	Fileinfo getFileUsingFname(String fname);
}
