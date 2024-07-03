package com.spring.mvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spring.mvc.entities.Student;

@Component
public class StudentDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int save(Student s){
		int i = (Integer)hibernateTemplate.save(s);
		return i;
	}
	
	@Transactional
	public List<Student> getAll(){
		return hibernateTemplate.loadAll(Student.class);
	}
	
}