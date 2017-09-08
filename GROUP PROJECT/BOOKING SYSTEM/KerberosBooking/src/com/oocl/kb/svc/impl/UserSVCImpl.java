package com.oocl.kb.svc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oocl.kb.dao.inf.UserDAO;
import com.oocl.kb.model.Role;
import com.oocl.kb.model.User;
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
		return this.userDAO.deleteUser(this.userDAO.getUser(username));
	}
	
	@Override
	public int createUser(String username, String password, String role, String firstName, String lastName,
			String email, String contactNo, int isDeleted) {
		// TODO Auto-generated method stub
		return this.userDAO.createUser(setupUserDetails(username,password,role,firstName,lastName,email,contactNo,isDeleted));
	}
	
	@Override
	public int updateUser(String username, String password, String role, String firstName, String lastName,
			String email, String contactNo, int isDeleted) {
		// TODO Auto-generated method stub
		return this.userDAO.updateUserByUsername(setupUserDetails(username,password,role,firstName,lastName,email,contactNo,isDeleted));
	}

	@Override
	public User setupUserDetails(String username, String password, String role, String firstName, String lastName,
			String email, String contactNo, int isDeleted) {
		// TODO Auto-generated method stub
		User thisUser = new User();
		
		thisUser.setUsername(username);
		thisUser.setPassword(password);
		thisUser.setRole(role);
		thisUser.setFirstName(firstName);
		thisUser.setLastName(lastName);
		thisUser.setEmail(email);
		thisUser.setContactNo(contactNo);
		thisUser.setDeleted(0);
		
		return thisUser;
	}
	
}
