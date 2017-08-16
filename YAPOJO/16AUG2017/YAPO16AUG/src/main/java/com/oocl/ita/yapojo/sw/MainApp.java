package com.oocl.ita.yapojo.sw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public MainApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloSpringTest obj = (HelloSpringTest) context.getBean("helloSpring");
		obj.getMessage();
	}

}
