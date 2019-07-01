package com.bway.springproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bway.springproject.model.User;

@Controller
public class LogInController {
	
	
	@RequestMapping(value ="/userlogin", method = RequestMethod.GET )
	public String getLogInForm()
	{
		return "login";
	}
	
	
	@RequestMapping(value = "/userlogin", method = RequestMethod.POST)
	//We are going to fetch the data
	public String userLogin(@ModelAttribute User user, Model model) //user is set with values password and username
 	{
		if(user.getUsername().equals("ram") && user.getPassword().equals("123")) {
			
			
			model.addAttribute("user", user.getUsername());
			
			
			return "home";
		}
		
		
		model.addAttribute("error", "User "+user.getUsername()+" doesnot exist");
		return "login";
	}
	

}
