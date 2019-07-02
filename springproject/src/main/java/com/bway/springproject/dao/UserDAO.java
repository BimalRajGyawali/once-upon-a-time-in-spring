package com.bway.springproject.dao;

import com.bway.springproject.model.User;

public interface UserDAO {
	
	public void signUp(User user);
	public User login(String username,String password);
	

}
