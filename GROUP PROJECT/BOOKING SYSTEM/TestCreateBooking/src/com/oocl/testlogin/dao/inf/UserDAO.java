package com.oocl.testlogin.dao.inf;

import org.hibernate.SessionFactory;

import com.oocl.testlogin.model.User;

public interface UserDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	
	public int validateUser(String username, String password);
	
	public User getUserDetails(String username, String password);
}
