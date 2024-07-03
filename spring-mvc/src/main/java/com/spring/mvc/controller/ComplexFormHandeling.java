package com.spring.mvc.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.mvc.entities.Person;
import com.spring.mvc.entities.User;

@Controller
public class ComplexFormHandeling {

	@GetMapping("/complex-form")
	public String complexForm(){
		return "complexForm";
	}
	
	@PostMapping("/complex-form-submit")
	public String complexFormSubmission(@ModelAttribute("p") Person p,Model m, BindingResult br){
		
		System.out.println(p);
		
		if(br.hasErrors()){
			return "redirect:/complex-form";
		}
		if(!"on".equalsIgnoreCase(p.getCheck()) ){
			m.addAttribute("error","error occured");
			return "redirect:/complex-form";
		}
		
		return "dataProfile";
	}
	
	
}
