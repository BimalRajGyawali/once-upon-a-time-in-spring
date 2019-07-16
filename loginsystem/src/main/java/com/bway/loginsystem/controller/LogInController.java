package com.bway.loginsystem.controller;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bway.loginsystem.model.User;

@Controller
public class LogInController {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String getLogInForm()
	{
		
		return "login";
	}
	
	/*
	 * 
	 *  Using request.getParameter("name given in html");
	 * 
	@RequestMapping(value="/userlogin",method = RequestMethod.POST)
	public String loginUser(HttpServletRequest request,Model model )
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("admin") && password.equals("123"))
		{
			model.addAttribute("msg", "Welcome "+username);
			return "home";
		}
		
		
			model.addAttribute("msg", "User"+username+" doesnot exists");
		
		
		return "login";
	
	}
	*/
	
	//using @RequestParam("name given in html") data-type varname
	
	/*
	@RequestMapping(value="/userlogin", method = RequestMethod.POST)
	public String logInUser(@RequestParam("username") String username, @RequestParam("password") String password, Model model ) {
		

		if(username.equals("admin") && password.equals("123"))
		{
			model.addAttribute("msg", "Hello "+username);
			return "home";
		}
		
		
			model.addAttribute("msg", "Error !! user"+username+" doesnot exists");
		
		
		
		
		return "login";
	}
	
	*/
	
	// using @ModelAttribute("model-name") Class varname
	
	@RequestMapping(value="/userlogin", method = RequestMethod.POST)
	public String logInUser(@ModelAttribute User user, Model model)
	{
	    String username = user.getUsername();
	    String password = user.getPassword();
	    

		if(username.equals("admin") && password.equals("123"))
		{
			model.addAttribute("msg", "Hello "+username);
			return "home";
		}
		
		
			model.addAttribute("msg", "Error !! user"+username+" doesnot exists");
		
		
		
		
		return "login";
	}
	
	@RequestMapping(value="/userlogin/{id}",method = RequestMethod.GET)
	public String pathVariable(@PathVariable("id") int id,Model model)
	{
		
		model.addAttribute("id", id);
		
		return "home";
	}
	
	
}
