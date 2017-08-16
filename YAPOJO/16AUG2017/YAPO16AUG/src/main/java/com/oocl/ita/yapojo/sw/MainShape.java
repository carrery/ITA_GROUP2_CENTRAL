package com.oocl.ita.yapojo.sw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainShape {

	public MainShape() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Shape shape1 = (Shape) context.getBean("shape1");
		shape1.draw();
		
		Shape shape2 = (Shape) context.getBean("shape2");
		shape2.draw();

	}

}
