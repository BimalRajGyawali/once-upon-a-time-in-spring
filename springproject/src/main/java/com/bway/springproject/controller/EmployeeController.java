package com.bway.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bway.springproject.dao.EmployeeDAO;
import com.bway.springproject.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDAO employeedao;
	
	@RequestMapping(value="/employee")
	public String getEmployeeForm(Model model)
	{
		
		model.addAttribute("emodel", new Employee());
		return "employeeform";
	}
	
	@RequestMapping(value="/employee", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute  Employee employee, Model model)
	{
		employeedao.addEmployee(employee);
		
		model.addAttribute("emp",employee);
		
		return "home";
	}
	
	
	
	
	
}
