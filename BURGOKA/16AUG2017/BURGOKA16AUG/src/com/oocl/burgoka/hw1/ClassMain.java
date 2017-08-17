package com.oocl.burgoka.hw1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassMain {

	public ClassMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("hw1_bean.xml");
		ClassA classA = (ClassA) context.getBean("classA");
		classA.getOrder();
	}

}
