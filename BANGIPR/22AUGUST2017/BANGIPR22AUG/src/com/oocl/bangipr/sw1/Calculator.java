package com.oocl.bangipr.sw1;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@WebService
public class Calculator {
	
	CalculatorImp calc = new CalculatorImp();
	

	
	@WebMethod(operationName = "Addition")
	public Double getSum(double  x , double y){	
		return calc.getSum(x, y);
		
	}
	
	
	@WebMethod(operationName = "Subtraction")
	public Double getDifference(double x , double y){

		return calc.getDifference(x, y);
	}
	
	@WebMethod(operationName = "Multiplication")
	public Double getProduct(double x , double y){

		return calc.getProduct(x, y);
		
	}
	
	@WebMethod(operationName = "Division")
	public Double getQuotient(double x , double y){

		return calc.getQuotient(x, y);
	}
	

}
