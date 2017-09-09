package com.oocl.kb.svc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oocl.kb.dao.inf.UserDAO;
import com.oocl.kb.model.Role;
import com.oocl.kb.model.User;
import com.oocl.kb.response.ServiceResponse;
import com.oocl.kb.response.UserLoginResponse;
import com.oocl.kb.svc.inf.UserSVC;

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
	public User getUserByUsernamePassword(String username, String password) {
		return this.userDAO.getUserDetails(username, password);
	}
	
	@Override
	public Role getRoleByUser(String role) {
		return this.userDAO.getUserRole(role);
	}
	
	@Override
	public UserLoginResponse getUserLoginResponse(String username, String password) {
		UserLoginResponse userResponse = new UserLoginResponse();
		if (username.isEmpty() || password.isEmpty()) {
			userResponse.setErrorMessage("Username or Password cannot be empty!");
		}
		
		else
		{			
			userResponse.setIsUserValid(validateUser(username, password));
			if(userResponse.getIsUserValid() == 1) {
				User thisUser = getUserByUsernamePassword(username,password);
				Role role = getRoleByUser(thisUser.getRole());
				userResponse.setCanCreateBooking(role.getAccessCB());
				userResponse.setCanViewBooking(role.getAccessFS());
				userResponse.setCanManageUsers(role.getAccessUM());				
			}
			else {
				userResponse.setErrorMessage("Incorrect Username or Password.");
			}			
		}
		return userResponse;
	}

	@Override
	public ServiceResponse deleteUser(String username) {
		// TODO Auto-generated method stub
		ServiceResponse response = new ServiceResponse();
		User user = this.userDAO.getUser(username);
		user.setDeleted(1);
		response.setServiceResult(this.userDAO.deleteUser(user));
		return response;
	}
	
	@Override
	public ServiceResponse createUser(String username, String password, String role, String firstName, String lastName,
			String email, String contactNo) {
		// TODO Auto-generated method stub
		ServiceResponse response = new ServiceResponse();
		response.setServiceResult(this.userDAO.createUser(setupUserDetails(username,password,role,firstName,lastName,email,contactNo)));
		return response;
	}
	
	@Override
	public ServiceResponse updateUser(String username, String password, String role, String firstName, String lastName,
			String email, String contactNo) {
		// TODO Auto-generated method stub
		ServiceResponse response = new ServiceResponse();
		
		if(this.userDAO.getUser(username) == null) {
			response.setErrorMessage("No user found");
		}
		
		User newUser = setupUserDetails(username,password,role,firstName,lastName,email,contactNo);
		response.setServiceResult(this.userDAO.updateUser(newUser));	
		
		return response;
	}

	@Override
	public User setupUserDetails(String username, String password, String role, String firstName, String lastName,
			String email, String contactNo) {
		// TODO Auto-generated method stub
		
		User user = new User(null, password, role, firstName.toUpperCase(), lastName.toUpperCase(), email, contactNo, 0);
		
		if(username != null) {
			user.setUsername(username.toUpperCase());
		}
		
		return user;
	}
	
}
