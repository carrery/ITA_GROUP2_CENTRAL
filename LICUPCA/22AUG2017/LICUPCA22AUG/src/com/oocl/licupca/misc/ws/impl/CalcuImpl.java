package com.oocl.licupca.misc.ws.impl;

public class CalcuImpl {

	public CalcuImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public double getAnswer(double x, String operator, double y) {
		switch (operator) {
		case "+":
			return x + y;
		case "-":
			return x - y;
		case "*":
			return x * y;
		case "/":
			return x / y;
		case "%":
			return x % y;
		}
		return 0;
	}

}
