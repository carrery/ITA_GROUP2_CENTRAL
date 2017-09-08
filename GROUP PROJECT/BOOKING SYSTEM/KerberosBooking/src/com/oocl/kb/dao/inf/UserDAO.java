package com.oocl.kb.dao.inf;

import java.util.List;

import org.hibernate.SessionFactory;

import com.oocl.kb.model.Role;
import com.oocl.kb.model.User;

public interface UserDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	
	public int validateUser(String username, String password);
	
	public User getUserDetails(String username, String password);
	
	public Role getUserRole(String userRole);

	public User getUser(String username);
	
	public List<User> getAllUsersByUsername(String username);

	public int deleteUser(User user);
	
	public int createUser(User user);
	
	public int updateUserByUsername(User user);
}
