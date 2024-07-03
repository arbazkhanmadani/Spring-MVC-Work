package com.spring.mvc.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.entities.User;
import com.spring.mvc.helper.CustomError;

@Controller
//@RequestMapping("/api") => have to fire before all the url.
public class HomeController {

	
	/*Adding common data to all url
	 *It will run before all url either in which we use model or not.
	 */
	@ModelAttribute
	public void comman(Model m){
		m.addAttribute("title", "spring-mvc");
	}
	
	@RequestMapping(path="/home", method=RequestMethod.GET)
	public String modelEx(Model model){

		model.addAttribute("data", new String("This is data from backend..."));
		return "home";
	}
	
	@RequestMapping("/registeration-form")
	public String registerationForm(){
		return "registerationForm";
	}
	
	@PostMapping("/registered")
	public ModelAndView register(
			@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("pass") String pass,
			@RequestParam(name="conf_pass",required=true) String cpass,
			@RequestParam("cbox") String cbox
			){
		
		 //ModelAndView => only accept Sting, Map.................
		 Map<String, Object> model = new HashMap<String, Object>();
		 User user = new User(name,email,pass,cbox);
		 model.put("user",user);		
		 System.out.println(user);
			 
		 return new ModelAndView("profile", model);
	} 
	
	
	@GetMapping("/login-form")
	public String loginForm(){
		return "loginForm";
	}
	
	/*
	 * @ModelAttribute => It bind all the params by itself
	 * @ModelAttribute => No args constructor is mandatory for this.
	 */
	@PostMapping("/login-url")
	public String login(@ModelAttribute User user, Model model){
		System.out.println(user);
		model.addAttribute("user",user);
		
		return "success";
	}

	@RequestMapping("/path-var/{id}/{name}")
	public String pathVarView(@PathVariable int id,@PathVariable String name, Model model){
		String s = null;
		//int len = s.length();
		List al = new LinkedList();
		al.add(id);
		al.add(name);
		model.addAttribute("list", al);
		return "pathVarView";
	}
	
	@RequestMapping("/param-var/q/") //=> we can take collection value in it. id=1,2,3 type LIST. 
	@ResponseBody
	public String paramVarView(@RequestParam(name="age",required=true) int age, @RequestParam String name, Model model){
		
		List al = new LinkedList();
		al.add(age);
		al.add(name);
		model.addAttribute("list", al);
		System.out.println(al+"===================	");
		if(age==22)
			return "paramVarView";
		else
			return "errorV+iew";
	}

}
