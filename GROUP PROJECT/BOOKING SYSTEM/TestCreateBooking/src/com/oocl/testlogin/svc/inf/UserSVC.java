package com.oocl.testlogin.svc.inf;

import com.oocl.testlogin.model.User;
import com.oocl.testlogin.response.UserLoginResponse;

public interface UserSVC {
	public int validateUser(String username, String password);

	User getUserByEmailPassword(String email, String password);

	UserLoginResponse getUserLoginResponse(String email, String password);
}
