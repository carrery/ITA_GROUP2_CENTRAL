package com.oocl.bangipr.sw1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloSpringTest obj = (HelloSpringTest) context.getBean("helloSpring");
		HelloSpringTest2 objA = (HelloSpringTest2) context.getBean("helloSpring2");
		
		obj.getMessage();
		objA.getMessage2();

	}

}
