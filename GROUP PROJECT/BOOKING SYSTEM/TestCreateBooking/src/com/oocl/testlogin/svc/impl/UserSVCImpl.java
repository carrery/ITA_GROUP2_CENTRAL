package com.oocl.testlogin.svc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oocl.testlogin.dao.inf.UserDAO;
import com.oocl.testlogin.model.User;
import com.oocl.testlogin.response.UserLoginResponse;
import com.oocl.testlogin.svc.inf.UserSVC;

@Component
public class UserSVCImpl implements UserSVC{
	
	@Autowired
	private UserDAO userDAO;
	
	
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public int validateUser(String email, String password) {
		return this.userDAO.validateUser(email, password);
	}
	
	@Override
	public User getUserByEmailPassword(String email, String password) {
		return this.userDAO.getUserDetails(email, password);
	}
	
	@Override
	public UserLoginResponse getUserLoginResponse(String username, String password) {
		UserLoginResponse userResponse = new UserLoginResponse();
		if (username.isEmpty() && password.isEmpty())
			return null;
		else
		{			
			userResponse.setIsUserValid(validateUser(username, password));
			userResponse.setIsUserValid(1);
			if(userResponse.getIsUserValid() == 1) {
				User thisUser = getUserByEmailPassword(username,password);
				switch(thisUser.getRole().toUpperCase()) {
					case "CUSTOMER":
						userResponse.setCanViewBooking(1);
						userResponse.setCanCreateBooking(0);
						userResponse.setCanManageUsers(0);
						break;
					case "CSV":
						userResponse.setCanViewBooking(1);
						userResponse.setCanCreateBooking(1);
						userResponse.setCanManageUsers(0);
						break;
					case "ADMIN":
						userResponse.setCanViewBooking(1);
						userResponse.setCanCreateBooking(1);
						userResponse.setCanManageUsers(1);
						break;
					default:
						return null;
				}
			}
			else {
				return userResponse;
			}			
		}
		return userResponse;
	}
	
}
