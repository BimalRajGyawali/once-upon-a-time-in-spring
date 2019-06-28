package com.test.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunStudent {
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		//=============Constructor Injection===============
		Student student = (Student) context.getBean("stud"); // Student.class deko vaye cast garnu pardaina
		System.out.println(student);
		
		
		//===========Setter Injection==============
		
		User user = context.getBean("user",User.class);
		System.out.println(user);
		
		
		
		
		
	}

}
