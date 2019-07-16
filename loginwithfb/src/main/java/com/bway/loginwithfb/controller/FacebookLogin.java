package com.bway.loginwithfb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FacebookLogin {
	
	
	@RequestMapping(value = "/facebook", method = RequestMethod.GET)
	public String fbLogin(){
		
	
		//String app_id = "2306831139424994";
		
		return "redirect:https://www.facebook.com/dialog/oauth?client_id=2306831139424994&redirect_uri=http://localhost:8080/loginwithfb/authorize&response_type=code&scope=email";
	}
	
	@RequestMapping(value = "/authorize", method = RequestMethod.GET)
	public String logInSuccess(Model model)
	{
		
		model.addAttribute("msg","hello");
		return "home";
	}

	
}
