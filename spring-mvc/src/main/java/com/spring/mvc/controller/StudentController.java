package com.spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.mvc.dao.StudentDAO;
import com.spring.mvc.entities.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentDAO studentDAO;
	
	@GetMapping("/enrollment-form")
	public String studentEnrollmentForm(){
		return "studentEnrollmentView";
	}
	
	
	@PostMapping("/submit-enrollment")
	@ResponseBody
	public String submitEnrollmentForm(@ModelAttribute Student s){
		
		int i = studentDAO.save(s);
		return "sucess......................";
	}
	
	@GetMapping("/show-student")
	public String showStudents(Model m){
		
		List<Student> stu = studentDAO.getAll();
		m.addAttribute("studentList", stu);
		
		System.out.println(stu);
		return "StudentListView";
	}
}
