package com.spring.mvc.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
//@RequestMapping("/redirect")
public class RedirectionController {

	@RequestMapping("/prefix-redirect")
	public String prefixRedirect(){
		System.out.println("prefix-redirect.........");
		return "redirect:/redirect-view-pre";
	}
	@RequestMapping("/redirect-view-pre")
	public String redirectViewPrefix(){
		System.out.println("prefix-redirect.........");
		return "redirectView";
	}
	
	@RequestMapping("/redirect-view")
	public RedirectView redirectView(){
		System.out.println("prefix-redirect.........");
		
		RedirectView rw = new RedirectView();
		rw.setUrl("https://www.google.com");
		return rw;
	}
	
	
	
	/*
	  @RequestParam String keyword,
            @RequestParam(defaultValue = "1") int page
      */
	
	//Controller specific exception handler.
	/*@ResponseStatus(value=HttpStatus.CONFLICT, reason="No Such Page Found.")
	@ExceptionHandler(value=NullPointerException.class)
	public String HandleException(Model model){
		System.out.println("erorrr");
		model.addAttribute("error", "error........................");
		System.out.println("erorrr1");
		return "errorHandlerPage";
	}
	*/
}