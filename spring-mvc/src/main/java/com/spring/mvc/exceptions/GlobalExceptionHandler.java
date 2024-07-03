package com.spring.mvc.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

//It is used to annot as global exception handler.
@ControllerAdvice
public class GlobalExceptionHandler {

	/*//@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Not found (404)")  
    @ExceptionHandler(value=Exception.class)
    public String globalHandler(HttpServletRequest request, Exception ex){
		System.out.println("erorrr");
		//model.addAttribute("error","exception............. is occured");
		//ModelAndView modelAndView = new ModelAndView();
	    //modelAndView.addObject("url", request.getRequestURL());
	    //modelAndView.addObject("exception", ex);
	    //modelAndView.setViewName("errorHandlerPage");
		
		System.out.println(ex);
		return "errorHandlerPage";
    }
	*/
	
	 /*@RequestMapping("/error-handler-page")
	 public String handle404(HttpServletRequest request) {
	        // Add any additional information to the model
	        // request.setAttribute("url", request.getRequestURL()); // Example of adding request URL to request attribute
	        
	        // Return the name of your error view for 404 errors
	    return "errorHandlerPage"; // or return the name of your custom error view for 404
	 }*/
}