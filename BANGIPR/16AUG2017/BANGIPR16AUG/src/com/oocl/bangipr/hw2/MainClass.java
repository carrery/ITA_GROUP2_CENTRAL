package com.oocl.bangipr.hw2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		NetworkManager netMngr = (NetworkManager) context.getBean("networkManager");
		
		((AbstractApplicationContext) context).close();

	}

}
