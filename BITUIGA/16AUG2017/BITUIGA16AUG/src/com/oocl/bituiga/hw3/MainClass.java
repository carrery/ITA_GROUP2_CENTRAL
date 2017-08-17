package com.oocl.bituiga.hw3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Bean2.xml");
        Employee emp1 = (Employee) context.getBean("thisEmployee");
        emp1.printEmployee();
	}

}
