package com.oocl.testlogin.svc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.oocl.testlogin.dao.inf.UserDAO;
import com.oocl.testlogin.svc.inf.UserSVC;

@Component
public class UserSVCImpl implements UserSVC{
	
	@Autowired
	private UserDAO userDAO;
	
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public int validateUser(String email, String password) {
		return this.userDAO.validateUser(email, password);
	}
}
