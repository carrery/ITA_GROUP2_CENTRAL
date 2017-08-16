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
		Company emp = (Company) context.getBean("company");
		System.out.println(emp.getCompanyName());
	}

}
