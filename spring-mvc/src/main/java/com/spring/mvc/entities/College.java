package com.spring.mvc.entities;

public class College {

	private String collegeName;

	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + "]";
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
}
