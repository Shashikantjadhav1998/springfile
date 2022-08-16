package com.example.demo.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@Entity
@JsonInclude(value = Include.NON_DEFAULT)
public class Fileinfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int fid;
private String fname;
@Lob
private byte [] filedata;
private long fsize;
private transient String errormesg;
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public byte[] getFiledata(byte[] bs) {
	return filedata;
}
public void setFiledata(byte[] filedata) {
	this.filedata = filedata;
}
public long getFsize(long l) {
	return fsize;
}
public void setFsize(long fsize) {
	this.fsize = fsize;
}
public String getErrormesg() {
	return errormesg;
}
public void setErrormesg(String errormesg) {
	this.errormesg = errormesg;
}
@Override
public String toString() {
	return "Fileinfo [fid=" + fid + ", fname=" + fname + ", filedata=" + Arrays.toString(filedata) + ", fsize=" + fsize
			+ "]";
}

}
