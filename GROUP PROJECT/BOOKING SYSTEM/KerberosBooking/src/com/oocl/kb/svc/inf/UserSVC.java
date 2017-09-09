package com.oocl.kb.svc.inf;

import com.oocl.kb.model.Role;
import com.oocl.kb.model.User;
import com.oocl.kb.response.UpdateUserResponse;
import com.oocl.kb.response.UserLoginResponse;

public interface UserSVC {
	public int validateUser(String username, String password);

	public User getUserByEmailPassword(String email, String password);

	public UserLoginResponse getUserLoginResponse(String email, String password);

	public int deleteUser(String username);
	
	public Role getRoleByUser(String role);

	public int createUser(String username, String password, String role, String firstName, String lastName,
			String email, String contactNo);

	public UpdateUserResponse updateUser(String username, String password, String role, String firstName, String lastName, String email,
			String contactNo);

	public User setupUserDetails(String username, String password, String role, String firstName, String lastName,
			String email, String contactNo);
	
}
