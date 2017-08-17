package com.oocl.bangipr.hw3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.bangipr.hw1.Order;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext ("Beans.xml");
		Employee emp = (Employee) context.getBean("emp1");		
		Employee emp2 = (Employee) context.getBean("emp2");	
		Employee emp3 = (Employee) context.getBean("emp3");
		
		emp.printEmp();
		emp2.printEmp();
		emp3.printEmp();

	}

}
