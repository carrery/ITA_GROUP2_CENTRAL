package com.oocl.ita.yapojo.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main4 {

	public Main4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ClassA classA = (ClassA) context.getBean("classA");
		classA.getOrder();

	}

}
