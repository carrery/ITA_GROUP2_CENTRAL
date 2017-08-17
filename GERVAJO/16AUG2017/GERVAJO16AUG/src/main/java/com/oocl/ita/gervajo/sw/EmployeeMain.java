package com.oocl.ita.gervajo.sw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Employee e = (Employee) context.getBean("employee");
		Employee e2 = (Employee) context.getBean("employee2");
		e.getEmployeeInfo();
		e2.getEmployeeInfo();

	}

}
