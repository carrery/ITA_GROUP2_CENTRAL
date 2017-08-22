package com.oocl.bituiga.sw2.logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.bituiga.sw1.webservice.MyCalculator;
import com.oocl.bituiga.sw1.webservice.business.MyCalculatorImpl;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");		
		MyCalculatorImpl calcuService = (MyCalculatorImpl) context.getBean("calkyoo2");
		MyCalculator calcuService2 = (MyCalculator) context.getBean("calkyoo1");
	    System.out.println("Result: " + calcuService2.calculateThis(calcuService.getEquation()));

	}

}
