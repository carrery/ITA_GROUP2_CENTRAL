package com.oocl.testlogin.dao.inf;

import org.hibernate.SessionFactory;

public interface UserDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	
	public int validateUser(String username, String password);
}
