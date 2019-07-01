package com.bway.springproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bway.springproject.model.User;

@Controller
public class SignUpController {
	
	@RequestMapping(value = "/usersignup", method = RequestMethod.GET)
	public String getSignUpForm()
	{
		return "signup";
	}
	
	@RequestMapping(value="/usersignup", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute User user)
	{
	    	
		return "login";
	}
	
	

}
