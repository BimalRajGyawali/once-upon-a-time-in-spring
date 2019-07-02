package com.bway.springproject.dao;

import java.util.List;

import com.bway.springproject.model.Employee;



public interface EmployeeDAO {
	
	public void addEmployee(Employee employee);
	public void deleteEmployee(int id);
	public void updateEmployee(Employee employee);
    public Employee getById(int id);
    public List<Employee> getAllEmployees();
    

}
