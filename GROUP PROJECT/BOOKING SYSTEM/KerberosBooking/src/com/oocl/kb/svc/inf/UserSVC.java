package com.oocl.kb.svc.inf;

import java.util.List;

import com.oocl.kb.model.Role;
import com.oocl.kb.model.User;
import com.oocl.kb.response.ServiceResponse;
import com.oocl.kb.response.UserLoginResponse;
import com.oocl.kb.response.UserMgtResponse;

public interface UserSVC {
	public int validateUser(String username, String password);

	public User getUserByUsernamePassword(String username, String password);

	public UserLoginResponse getUserLoginResponse(String email, String password);

	public ServiceResponse deleteUser(String username);
	
	public Role getRoleByUser(String role);
	
	public ServiceResponse createUser(String json);

	public ServiceResponse updateUser(String json);
	
	public UserMgtResponse searchUser(String username, String fname, String lname, String role);
}
