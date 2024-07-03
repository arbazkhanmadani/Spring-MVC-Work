package com.spring.mvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cookie")
public class CookieController {

	@GetMapping("/set-cookie")
	@ResponseBody
	public String setCookie(@CookieValue(value="name", defaultValue="Arbaz") String name, HttpServletResponse res){
		
		Cookie ck = new Cookie("name", name);
		ck.setHttpOnly(true);
		ck.setMaxAge(1000);
		res.addCookie(ck);
		
		return "Cookie set successfully!";
	}
	
	
	@GetMapping("/get-cookie")
	@ResponseBody
	public String getCookie(HttpServletRequest req, @CookieValue(value = "name", defaultValue = "unknown") String cookieName){
	 
		 Cookie[] cookies = req.getCookies();
		 
	     if(cookies != null) {
	        for(Cookie cookie : cookies) {
	            if(cookie.getName().equals("name")) {
	            	return "Cookie value: " + cookie.getValue();
	            }
	        }
	     }
		return "cookie not found";
	}
	
	@GetMapping("/remove-cookie")
	@ResponseBody
	public String removeCookie(HttpServletResponse res, HttpServletRequest req){
	
		 Cookie cookie = new Cookie("name", null);
		 
		 //cookie.setPath(req.getServletContext()+"/set-cookie");
	     //This line is must else cookie wont delete
		 //path of setting cookie and removing must be same.
		 cookie.setPath(req.getServletContext()+"/set-cookie");
	     cookie.setMaxAge(0);
	     res.addCookie(cookie);
	     
	     return "cookie deleted....";
	}
}
