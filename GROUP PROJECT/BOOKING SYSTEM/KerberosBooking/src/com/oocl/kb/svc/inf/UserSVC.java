package com.oocl.kb.svc.inf;

import java.util.List;

import com.oocl.kb.model.Role;
import com.oocl.kb.model.User;
import com.oocl.kb.response.ServiceResponse;
import com.oocl.kb.response.UserLoginResponse;

public interface UserSVC {
	public int validateUser(String username, String password);

	public User getUserByUsernamePassword(String username, String password);

	public UserLoginResponse getUserLoginResponse(String email, String password);

	public ServiceResponse deleteUser(String username);
	
	public Role getRoleByUser(String role);

	public ServiceResponse createUser(String username, String password, String role, String firstName, String lastName,
			String email, String contactNo);

	public ServiceResponse updateUser(String username, String password, String role, String firstName, String lastName, String email,
			String contactNo);

	public User setupUserDetails(String username, String password, String role, String firstName, String lastName,
			String email, String contactNo);
	
	public List<User> searchUser(String username, String fname, String lname, String role);
}
