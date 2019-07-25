package com.bway.mailsendingsystem;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmailController {

 @RequestMapping(value = "/" , method = RequestMethod.GET)
   public String getEmailForm()
   {
	   return "email";
   }
 
   @RequestMapping(value="/sendemail",method = RequestMethod.POST)
   public String sendEmail(HttpServletRequest request, Model model)
   {
	   String to = request.getParameter("to");
	   String subject = request.getParameter("subject");
	   String message = request.getParameter("message");
	   
	   if(Mailer.sendEmail(to, subject, message))
	   {
		   model.addAttribute("msg","E-mail sent successfully");
	   }
	   
	   else 
	   {
		   model.addAttribute("msg","E-mail not sent successfully");	
	   }
	   
	   return "home";
   }
	

}
