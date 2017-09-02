package com.oocl.testlogin.dao.impl;

import com.oocl.testlogin.dao.inf.UserDAO;

public class UserDAOImpl implements UserDAO{

	@Override
	public boolean validateUser(String username, String password) {
		return false;
	}

}
