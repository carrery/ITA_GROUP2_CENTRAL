package com.oocl.burgoka.webservice.business;

import java.util.ArrayList;
import java.util.List;

import com.oocl.burgoka.webservicesw1.*;

import net.webservice.CalculateThis;
import net.webservice.MyCalculator;
import net.webservice.MyCalculatorService;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@WebService
public class Calculator {
	
	CalculatorImpl cal = new CalculatorImpl();

	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	@WebMethod
	public int getOutputResult(String input) {
		
		return cal.getProducts(cal.getOutputCategories(input));
		
		/*ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		MyCalculator myCal = (MyCalculator) context.getBean("calcu");
		
		MyCalculatorService ser = new MyCalculatorService();
		MyCalculator cal = ser.getMyCalculatorPort();
		Double th = cal.calculateThis(input);
		return th;*/
	}

}
