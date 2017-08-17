package com.oocl.ita.yapojo.sw;

public class HelloSpringTest {

	private String message;
	
	public HelloSpringTest() {
		// TODO Auto-generated constructor stub
	}
	
	public void setMessage(String msg) {
		this.message = msg;
	}
	
	public void getMessage() {
		System.out.println("Your Message " + message);	
	}

}
