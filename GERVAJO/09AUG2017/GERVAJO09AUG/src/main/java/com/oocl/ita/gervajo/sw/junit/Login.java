package com.oocl.ita.gervajo.sw.junit;

public class Login {
	String username;
	String password;
	String inputUsername;
	String inputPassword;

	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getInputUsername() {
		return inputUsername;
	}

	public void setInputUsername(String inputUsername) {
		this.inputUsername = inputUsername;
	}

	public String getInputPassword() {
		return inputPassword;
	}

	public void setInputPassword(String inputPassword) {
		this.inputPassword = inputPassword;
	}
	
	public String validateCredentials(String inputUsername , String inputPassword) {
		if (username.equals(inputUsername)) {
			if(validatePassword(password, inputPassword) == "true") {
				return "true";
			} else {
				return "false";
			}			
		} else {
			return "false";
		}
		
	}
	
	public String validatePassword(String password,String inputPassword) {
		if(password.equals(inputPassword)) {
			return "true";
		} else if (password.equalsIgnoreCase(inputPassword)){
			return "false";
		} else {
			return "false";
		}
	}
}
