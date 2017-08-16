package com.oocl.ita.yapojo.sw;

public class HelloSpring_init_dest {
	
	String message;
	
	public HelloSpring_init_dest() {
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("Initialization!");
	}
	
	public void destroy() {
		System.out.println("Destroyed!");
	}

}
