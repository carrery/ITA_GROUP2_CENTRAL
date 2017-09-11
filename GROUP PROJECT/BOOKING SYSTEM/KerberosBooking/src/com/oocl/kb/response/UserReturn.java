package com.oocl.kb.response;

import com.oocl.kb.model.User;

public class UserReturn extends User{
	
	public int canViewBkg;
	
public int canCreateBkg;
	
	public int canManageUsers;
	
	public int getCanViewBkg() {
		return canViewBkg;
	}

	public void setCanViewBkg(int canViewBkg) {
		this.canViewBkg = canViewBkg;
	}

	public int getCanCreateBkg() {
		return canCreateBkg;
	}

	public void setCanCreateBkg(int canCreateBkg) {
		this.canCreateBkg = canCreateBkg;
	}

	public int getCanManageUsers() {
		return canManageUsers;
	}

	public void setCanManageUsers(int canManageUsers) {
		this.canManageUsers = canManageUsers;
	}
	
}
