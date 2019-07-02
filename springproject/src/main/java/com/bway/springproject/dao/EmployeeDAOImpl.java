package com.bway.springproject.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bway.springproject.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Resource
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void addEmployee(Employee employee) {

		Session session = sessionFactory.getCurrentSession();
		session.save(employee);

	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {

		Session session = sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.get(Employee.class, id);
		session.delete(employee);

	}

	@Override
	@Transactional
	public void updateEmployee(Employee employee) {

		Session session = sessionFactory.getCurrentSession();
		session.update(employee);

	}

	@Override
	@Transactional
	public Employee getById(int id) {

		Session session = sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.get(Employee.class, id);

		return employee;
	}

	@Override
	@Transactional
	public List<Employee> getAllEmployees() {

		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Employee.class);

		List<Employee> employees = criteria.list();

		return employees;
	}

}
