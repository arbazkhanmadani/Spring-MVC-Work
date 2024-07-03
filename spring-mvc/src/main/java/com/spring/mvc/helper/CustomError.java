package com.spring.mvc.helper;

public class CustomError {

	private int statusCod;
	private String status;
	public CustomError(int statusCod, String status) {
		super();
		this.statusCod = statusCod;
		this.status = status;
	}
	public int getStatusCod() {
		return statusCod;
	}
	public void setStatusCod(int statusCod) {
		this.statusCod = statusCod;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
