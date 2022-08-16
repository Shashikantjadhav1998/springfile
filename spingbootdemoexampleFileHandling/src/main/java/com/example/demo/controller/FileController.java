package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Fileinfo;
import com.example.demo.service.FileService;

@RestController
public class FileController {
	@Autowired
private FileService fs;
	@PostMapping(value = "/addfile")
	public String addfile(@RequestParam MultipartFile fileinfo, @RequestParam("uname") String uname) throws IOException {
		System.out.println("File Name : " + fileinfo.getOriginalFilename());
		System.out.println("User Name : " + uname);
		Fileinfo file = new Fileinfo();
		file.setFname(uname +"_"+ fileinfo.getOriginalFilename());
		file.getFiledata(fileinfo.getBytes());
		file.getFsize(fileinfo.getSize());
		
		return "File Store In database";
	
		
		
	}
	@GetMapping(value = "/getFile/{fname}")
	public Fileinfo getFileUsingFileName(@PathVariable String fname){
		System.out.println("File Name : " + fname);
		Fileinfo fileInfo = fs.getFileUsingFname(fname);
		System.out.println(fileInfo.getErrormesg());
		return fileInfo;
	}
}
