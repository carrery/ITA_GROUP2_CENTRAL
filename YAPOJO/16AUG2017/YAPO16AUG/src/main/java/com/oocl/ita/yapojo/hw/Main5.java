package com.oocl.ita.yapojo.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main5 {

	public Main5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		NetworkManager netMngr = (NetworkManager) context.getBean("networkManager");
		
		((AbstractApplicationContext) context).close();
		
	}

}
