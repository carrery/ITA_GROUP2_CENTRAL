package com.oocl.licupca.sw.exercise6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("EmployeesConfig.xml");
		Employee juan = (Employee) context.getBean("employee_juan");
		juan.printDetails();
		
		Employee jose = (Employee) context.getBean("employee_jose");
		jose.printDetails();
		
		Employee pedro = (Employee) context.getBean("employee_pedro");
		pedro.printDetails();
	}
}
