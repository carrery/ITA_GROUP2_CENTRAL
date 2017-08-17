package com.oocl.burgoka.sw2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Shape {

	public String hugis;
	
	public String getHugis() {
		return hugis;
	}

	public void setHugis(String hugis) {
		this.hugis = hugis;
	}

	public Shape() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		Circle cir = (Circle) context.getBean("circle");
		Triangle tri = (Triangle) context.getBean("triangle");
		Drawing dr = new Drawing();
		dr.drawing(tri);
		dr.drawing(cir);
	}
}
