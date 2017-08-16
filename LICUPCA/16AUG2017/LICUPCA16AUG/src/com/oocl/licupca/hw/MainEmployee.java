package com.oocl.licupca.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee {

	public MainEmployee() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeesConfig.xml");
		Employee emp = (Employee) context.getBean("employee_juan");
		emp.getDetails();
		
		emp = (Employee) context.getBean("employee_pedro");
		emp.getDetails();
		
	}

}
