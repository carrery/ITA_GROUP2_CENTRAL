package com.oocl.testlogin.transaction.inf;

import java.util.List;


import com.oocl.testlogin.model.User;

public interface UserTransaction {
	public List<User> getAllUsers();

	public List<User> getUserById(String userId);

	public int validateUser(String user, String pass);
	
}
