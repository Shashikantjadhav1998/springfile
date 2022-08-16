package com.example.demo.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Fileinfo;
import com.example.demo.repo.FileRepository;

@Service
public class FileServiceImpl implements FileService{
	@Autowired
private FileRepository fr;

	@Override
	public void addFileInfoData(Fileinfo fileInfo) {
		// TODO Auto-generated method stub
		fr.save(fileInfo);
	}

	@Override
	public Fileinfo getFileUsingFname(String fname) {
		// TODO Auto-generated method stub
		Fileinfo fileInfo = fr.findByFname(fname);
		if(Objects.nonNull(fileInfo)) {
			return fileInfo;
		} else {
			Fileinfo fileInfo2 = new Fileinfo();
            fileInfo2.setErrormesg("File Not Exist");
			return fileInfo2;
		}

	
	}
}
