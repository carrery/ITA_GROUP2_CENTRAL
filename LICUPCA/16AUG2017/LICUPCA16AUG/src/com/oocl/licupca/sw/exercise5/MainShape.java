package com.oocl.licupca.sw.exercise5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainShape {

	public static void main (String [] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("ShapesConfig.xml");
		Shape circle = (Shape) context.getBean("shape_circle");
		circle.draw();
	}

}
