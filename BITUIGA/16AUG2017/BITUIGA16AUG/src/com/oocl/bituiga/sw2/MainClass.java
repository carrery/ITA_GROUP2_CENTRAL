package com.oocl.bituiga.sw2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("MrBean.xml");
		Shape ship1 = (Shape) ctx.getBean("serkol");
		Shape ship2 = (Shape) ctx.getBean("trayangol");
		Drawing drowing = (Drawing) ctx.getBean("druwing");
		drowing.draw(ship1);
		drowing.draw(ship2);
	}
	
}
