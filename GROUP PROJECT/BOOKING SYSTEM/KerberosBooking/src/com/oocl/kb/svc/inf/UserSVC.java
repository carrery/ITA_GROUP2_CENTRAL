package com.oocl.kb.svc.inf;

import com.oocl.kb.model.User;
import com.oocl.kb.response.UserLoginResponse;

public interface UserSVC {
	public int validateUser(String username, String password);

	User getUserByEmailPassword(String email, String password);

	UserLoginResponse getUserLoginResponse(String email, String password);

	public int deleteUser(String username);
}
