package com.oocl.bituiga.sw1.webservice;

import java.util.*;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.bituiga.sw1.webservice.business.MyCalculatorImpl;

@WebService
public class MyCalculator {
	
	
	
	MyCalculatorImpl calculatorService = new MyCalculatorImpl();

	@WebMethod
	public Double calculateThis(String equation) {
		calculatorService.initCalculator(equation);		
		return calculatorService.getResult();
	}
}
