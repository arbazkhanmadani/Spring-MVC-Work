package com.spring.mvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/session")
public class SessionController {

	private static int SESSION_COUNT = 0;

	@GetMapping("/set-session")
	@ResponseBody
	public String setSession(HttpServletResponse res, HttpServletRequest req){
		
		
		HttpSession hs = req.getSession();
		hs.setAttribute("id",++SESSION_COUNT);
		return "Session set successfully!";
	}
	
	
	@GetMapping("/get-session")
	@ResponseBody
	public String getSession(HttpServletRequest req){
	 
		HttpSession hs =  req.getSession(false);
		if(hs!=null){
			int id = (Integer) hs.getAttribute("id");
			return "session value is -> "+id;
		}
		return "session value is deleted... ";
	}
	
	@GetMapping("/remove-session")
	@ResponseBody
	public String removeSession(HttpServletResponse res, HttpServletRequest req){
		
		HttpSession hs = req.getSession(false);
		//hs.removeAttribute("id");
		hs.invalidate();
		
		return "Session deleted....";
	}
}
