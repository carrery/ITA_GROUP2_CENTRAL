package com.oocl.licupca.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCustomer {

	public MainCustomer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("OrderConfig.xml");
		ClassA classA = (ClassA) context.getBean("fries");
		classA.getOrder().getDetails();

		classA = (ClassA) context.getBean("chicken");
		classA.getOrder().getDetails();

	}

}
