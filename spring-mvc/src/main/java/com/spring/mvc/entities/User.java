package com.spring.mvc.entities;

public class User {

	private String name;
	private String email;
	private String pass;
	private String cbox;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String emal) {
		this.email = emal;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getCbox() {
		return cbox;
	}
	public void setCbox(String cbox) {
		this.cbox = cbox;
	}
	
	public User() {} 
	public User(String email, String pass) {
		this.email = email;
		this.pass = pass;
	}
	public User(String name, String email, String pass, String cbox) {
		super();
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.cbox = cbox;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", emal=" + email + ", pass=" + pass + ", cbox=" + cbox + "]";
	}
	
	
}