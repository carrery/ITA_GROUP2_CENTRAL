package com.oocl.kb.response;


public class UserLoginResponse {
	
	public int isUserValid;
	
	public int getIsUserValid() {
		return isUserValid;
	}

	public void setIsUserValid(int isUserValid) {
		this.isUserValid = isUserValid;
	}

	public int getCanViewBooking() {
		return canViewBooking;
	}

	public void setCanViewBooking(int canViewBooking) {
		this.canViewBooking = canViewBooking;
	}

	public int getCanCreateBooking() {
		return canCreateBooking;
	}

	public void setCanCreateBooking(int canCreateBooking) {
		this.canCreateBooking = canCreateBooking;
	}

	public int getCanManageUsers() {
		return canManageUsers;
	}

	public void setCanManageUsers(int canManageUsers) {
		this.canManageUsers = canManageUsers;
	}

	public int canViewBooking;
	
	public int canCreateBooking;
	
	public int canManageUsers;
	

}
