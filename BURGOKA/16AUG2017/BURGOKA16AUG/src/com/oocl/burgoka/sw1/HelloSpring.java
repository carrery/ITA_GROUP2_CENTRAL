package com.oocl.burgoka.sw1;

public class HelloSpring {	
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {	
		System.out.println("Hey: " + message );
	}
	
}

