package com.oocl.bituiga.sw1;

import java.io.PrintStream;

public class InsufficientFundsException extends Throwable{

	public InsufficientFundsException() {
		// TODO Auto-generated constructor stub
		System.out.println("Insufficient Funds!");
	}
	
//	@Override
//	public void printStackTrace(PrintStream s) {
//		// TODO Auto-generated method stub
////		super.printStackTrace(s);
//		System.out.println("Insufficient Funds! Trying to ");
//	}
	

}
