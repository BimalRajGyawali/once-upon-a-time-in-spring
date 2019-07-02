package com.bway.springproject.dao;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bway.springproject.model.User;

//import javax.annotation.Resource;


@Repository
public class UserDAOImpl implements UserDAO{

    @Resource
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public void signUp(User user) {
		
		
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		
		
	}

	@Override
	@Transactional
	public User login(String username, String password) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Criteria criteria = session.createCriteria(User.class);

		criteria.add(Restrictions.eq("username", username)).add(Restrictions.eq("password", password));
		
		User user = (User)criteria.uniqueResult();
	
		return user;
	}
	
	

}
