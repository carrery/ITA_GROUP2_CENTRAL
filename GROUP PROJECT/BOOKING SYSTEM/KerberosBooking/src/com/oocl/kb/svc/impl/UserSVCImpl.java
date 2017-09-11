package com.oocl.kb.svc.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.oocl.kb.dao.inf.UserDAO;
import com.oocl.kb.model.Role;
import com.oocl.kb.model.Shipment;
import com.oocl.kb.model.User;
import com.oocl.kb.response.ServiceResponse;
import com.oocl.kb.response.UserLoginResponse;
import com.oocl.kb.response.UserMgtResponse;
import com.oocl.kb.response.UserReturn;
import com.oocl.kb.svc.inf.UserSVC;

@Component
public class UserSVCImpl implements UserSVC{
	
	private UserDAO userDAO;
	
	Gson gson = new Gson();
	
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
	public ServiceResponse updateUser(String json) {
		// TODO Auto-generated method stub
		ServiceResponse response = new ServiceResponse();
		User usr = gson.fromJson(json, User.class);
		if(this.userDAO.getUser(usr.getUsername()) == null) 
			response.setErrorMessage("No user found");
		
		response.setServiceResult(this.userDAO.updateUser(usr));	
		
		return response;
	}

	@Override
	public UserMgtResponse searchUser(String username, String firstName, String lastName, String role) {
		// TODO Auto-generated method stub		
		UserMgtResponse response = new UserMgtResponse();
		List<UserReturn> users = new ArrayList<UserReturn>();
		UserReturn userRet = new UserReturn();
		for(User user : this.userDAO.getAllUsers(username,firstName,lastName,role)) {
			userRet.setRole(getRoleByUser(user.getRole()));
			userRet.setUser(user);
			users.add(userRet);
		}
		response.setUsers(users);
		return response;
	}

	@Override
	public ServiceResponse createUser(String json) {
		// TODO Auto-generated method stub
		User usr = gson.fromJson(json, User.class);
		ServiceResponse response = new ServiceResponse();		
		response.setServiceResult(userDAO.createUser(usr));
		return response;
	}
	
}
