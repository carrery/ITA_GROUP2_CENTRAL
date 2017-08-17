package com.oocl.bangipr.sw6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		
			ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
			Employee emp = (Employee) context.getBean("employeeLists");

			emp.getEmployeeList();
		

	}

}
