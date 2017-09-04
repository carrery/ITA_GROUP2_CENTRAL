package com.oocl.testlogin.response;

import com.oocl.testlogin.model.User;

public class UserResponse {
		
	public User currentUser;

	public int isValid;

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

	public int getIsValid() {
		return isValid;
	}

	public void setIsValid(int isValid) {
		this.isValid = isValid;
	}
	
	
}
