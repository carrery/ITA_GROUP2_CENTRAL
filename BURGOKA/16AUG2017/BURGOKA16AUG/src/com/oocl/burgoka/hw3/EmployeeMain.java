package com.oocl.burgoka.hw3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.burgoka.hw3.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hw3_bean.xml");
	     Employee myEmp = (Employee) context.getBean("employee");
	     System.out.println(myEmp.infoCompany());
	}
}
