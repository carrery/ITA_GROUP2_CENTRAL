package com.oocl.bangipr.sw5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext ("Beans.xml");
		Shape shape2 = (Shape) context.getBean("shapeCirc");
		Shape shape3 = (Shape) context.getBean("shapeTria");

		shape2.draw();
		shape3.draw();
		

	}
}
