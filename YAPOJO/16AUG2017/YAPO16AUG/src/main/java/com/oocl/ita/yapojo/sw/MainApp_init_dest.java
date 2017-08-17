package com.oocl.ita.yapojo.sw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp_init_dest {

	public MainApp_init_dest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloSpring_init_dest obj = (HelloSpring_init_dest) context.getBean("helloSpring3");
		obj.getMessage();
		//context.registerShutdownHook();

	}

}
