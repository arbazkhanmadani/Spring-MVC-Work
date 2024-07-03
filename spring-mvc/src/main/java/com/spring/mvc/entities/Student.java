package com.spring.mvc.entities;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Qualifier;

@Entity
@Qualifier("student")
public class Student {

	@Id
	@Column(name="roll_number")
	private int rollNo;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="student_name", nullable=false)
	private String name;
	
	public Student(){}
}
