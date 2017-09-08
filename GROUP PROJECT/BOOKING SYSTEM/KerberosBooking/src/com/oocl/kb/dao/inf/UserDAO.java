package com.oocl.kb.dao.inf;

import org.hibernate.SessionFactory;

import com.oocl.kb.model.Role;
import com.oocl.kb.model.User;

public interface UserDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	
	public int validateUser(String username, String password);
	
	public User getUserDetails(String username, String password);
	
	public Role getUserRole(String userRole);
}
