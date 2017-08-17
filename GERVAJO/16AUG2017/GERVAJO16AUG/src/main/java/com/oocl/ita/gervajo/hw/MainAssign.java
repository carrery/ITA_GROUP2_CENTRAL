package com.oocl.ita.gervajo.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.ita.gervajo.hw.ClassA;

public class MainAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ClassA ca = (ClassA) context.getBean("classA");
		ca.getOrder();
		
		ClassA cb = (ClassA) context.getBean("classB");
		cb.getOrder();
	}

}
