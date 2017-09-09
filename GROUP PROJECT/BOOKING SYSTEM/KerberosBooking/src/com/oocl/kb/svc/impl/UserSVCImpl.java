package com.oocl.kb.svc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oocl.kb.dao.inf.UserDAO;
import com.oocl.kb.model.Role;
import com.oocl.kb.model.User;
import com.oocl.kb.response.UpdateUserResponse;
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
	public User getUserByEmailPassword(String email, String password) {
		return this.userDAO.getUserDetails(email, password);
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
				User thisUser = getUserByEmailPassword(username,password);
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
	public int deleteUser(String username) {
		// TODO Auto-generated method stub
		User user = this.userDAO.getUser(username);
		user.setDeleted(1);
		return this.userDAO.deleteUser(user);
	}
	
	@Override
	public int createUser(String username, String password, String role, String firstName, String lastName,
			String email, String contactNo, int isDeleted) {
		// TODO Auto-generated method stub
		return this.userDAO.createUser(setupUserDetails(username,password,role,firstName,lastName,email,contactNo,isDeleted));
	}
	
	@Override
	public UpdateUserResponse updateUser(String username, String password, String role, String firstName, String lastName,
			String email, String contactNo, int isDeleted) {
		// TODO Auto-generated method stub
		UpdateUserResponse response = new UpdateUserResponse();
		
		if(this.userDAO.getUser(username) == null) {
			response.setErrorMesssage("No user found");
		}
		
		User newUser = setupUserDetails(username,password,role,firstName,lastName,email,contactNo,isDeleted);
		response.setIsUpdateSuccess(this.userDAO.updateUserByUsername(newUser));	
		
		return response;
	}

	@Override
	public User setupUserDetails(String username, String password, String role, String firstName, String lastName,
			String email, String contactNo, int isDeleted) {
		// TODO Auto-generated method stub
		User user = new User();
		
		if(username != null) {
			user.setUsername(username.toUpperCase());
		}
		
		user.setUsername(username);
		user.setPassword(password);
		user.setRole(role);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setFirstName(firstName.toUpperCase());
		user.setLastName(lastName.toUpperCase());
		user.setContactNo(contactNo);
		user.setDeleted(0);
		
		return user;
	}
	
}
