package com.oocl.ita.yapojo.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main6 {

	public Main6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Employee emp1 = (Employee) context.getBean("emp1");
		emp1.getDetails();
		
		Employee emp2 = (Employee) context.getBean("emp2");
		emp2.getDetails();
		
	}

}
