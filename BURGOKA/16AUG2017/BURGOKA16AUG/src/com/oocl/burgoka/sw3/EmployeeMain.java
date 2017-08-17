package com.oocl.burgoka.sw3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	

	public EmployeeMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDetails emp = (EmployeeDetails) context.getBean("employee");
		emp.getEmpname();
		emp.getEmprole();
		emp.getEmpid();
	}

}
