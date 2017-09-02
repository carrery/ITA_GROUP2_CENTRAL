package com.oocl.testlogin.svc.impl;

import com.oocl.testlogin.dao.inf.UserDAO;

public class UserSVCImpl {
	
	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public boolean validateUser(String email, String password) {
		return this.userDAO.validateUser(email, password);
	}
}
