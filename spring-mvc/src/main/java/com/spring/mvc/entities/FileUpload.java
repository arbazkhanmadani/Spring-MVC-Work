package com.spring.mvc.entities;

public class FileUpload {

	private String fileName;

	@Override
	public String toString() {
		return "FileUpload [fileName=" + fileName + "]";
	}

	public FileUpload(String fileName) {
		super();
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
