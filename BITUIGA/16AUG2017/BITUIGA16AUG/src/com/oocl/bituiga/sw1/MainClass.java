package com.oocl.bituiga.sw1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("TestBean.xml");
		HelloSpring henlo = (HelloSpring) ctx.getBean("hiloBean");
		henlo.getNyeam();
		henlo.getNyeam2();
		henlo.getNyeam3();
		((AbstractApplicationContext) ctx).registerShutdownHook();
	}
}
