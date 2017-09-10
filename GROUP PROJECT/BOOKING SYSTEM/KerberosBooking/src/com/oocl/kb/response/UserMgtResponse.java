package com.oocl.kb.response;

import java.util.List;

public class UserMgtResponse extends ServiceResponse{
	public List<UserReturn> users ;

	public List<UserReturn> getUsers() {
		return users;
	}

	public void setUsers(List<UserReturn> users) {
		this.users = users;
	}
}
