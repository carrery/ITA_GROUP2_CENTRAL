package com.oocl.testlogin.svc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oocl.testlogin.dao.inf.UserDAO;
import com.oocl.testlogin.model.User;
import com.oocl.testlogin.response.UserResponse;
import com.oocl.testlogin.svc.inf.UserSVC;

@Component
public class UserSVCImpl implements UserSVC{
	
	@Autowired
	private UserDAO userDAO;
	private UserResponse userResponse;
	
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public int validateUser(String email, String password) {
		return this.userDAO.validateUser(email, password);
	}
	
	@Override
	public User getUserByEmailPassword(String email, String password) {
//		return this.userDAO.getUser(email, password);
		return null;
	}
	
	@Override
	public UserResponse getUserLoginResponse(String username, String password) {
		if (username.isEmpty() && password.isEmpty())
			return null;
		else
		{
			userResponse.currentUser = getUserByEmailPassword(username,password);
			userResponse.isValid = 1;
		}
		return userResponse;
	}
	
}
