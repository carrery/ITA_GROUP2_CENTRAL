package com.oocl.ita.yapojo.sw;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.oocl.ita.yapo.day17.webservice.business.CalculatorServiceImple;

@WebService
public class CalculatorApplication {
	CalculatorServiceImple calculator = new CalculatorServiceImple();
	
	@WebMethod
	public List<String> getOperations() {
		return calculator.getOperations();
	}
	
	public double getCalculation(double a, String operation, double b) {
		return calculator.getCalculation(a, operation, b);
	}
}
