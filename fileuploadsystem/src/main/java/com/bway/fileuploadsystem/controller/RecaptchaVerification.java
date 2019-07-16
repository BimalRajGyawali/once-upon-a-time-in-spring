package com.bway.fileuploadsystem.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RecaptchaVerification {
	
	
	@RequestMapping(value = "/verifyrecaptcha", method = RequestMethod.POST)
	public String doVerify(HttpServletRequest request, Model model) throws IOException
	{
		
		String input = request.getParameter("g-repatcha-response");
		
		if(VerifyRecaptcha.verify(input))
		{
			model.addAttribute("repatchamsg", "Verified");
			return "upload";
		}
		
		model.addAttribute("repatchamsg", "You are a robot");
		
		return "upload";
	}
	
	
	

}
