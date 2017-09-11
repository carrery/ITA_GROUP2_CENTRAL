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

	public String deleteUser(User user);
	
	public String createUser(User user);
	
	public String updateUser(User user);

	public List<User> getAllUsers(String userName, String fname, String lname, String role);

}
