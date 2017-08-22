package com.oocl.burgoka.webservice.business;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.burgoka.webservicesw1.CalculatorImpl;

import net.webservice.MyCalculator;

public class MainApp {

	public MainApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		CalculatorImpl myCal = (CalculatorImpl) context.getBean("calcu");
		myCal.getProducts(myCal.getOutputCategories(myCal.getCat()));
	}
}
