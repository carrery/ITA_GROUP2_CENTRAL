package com.oocl.kb.response;

import com.oocl.kb.model.Role;
import com.oocl.kb.model.User;

public class UserReturn{
	public User user ;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Role role ;
}
