package com.oocl.ita.yapo.day17.webservice.business;

import java.util.ArrayList;
import java.util.List;

public class CalculatorServiceImple {
	
	public List<String> getOperations() {
		List<String> operations = new ArrayList<>();
		operations.add("Add || +");
		operations.add("Subract || -");
		operations.add("Multiply || * ");
		operations.add("Divide || /");
		return operations;
	}
	
	public double getCalculation(double a, String operation, double b) {
		if(operation.equalsIgnoreCase("add") || operation.equalsIgnoreCase("+")) {
			return a + b;
		} else if(operation.equalsIgnoreCase("subtract") || operation.equalsIgnoreCase("-")) {
			return a - b;
		} else if(operation.equalsIgnoreCase("multiply") || operation.equalsIgnoreCase("*")) {
			return a * b;
		} else if(operation.equalsIgnoreCase("divide") || operation.equalsIgnoreCase("/")) {
			return a / b;
		}
		return 0;	
	}
}
