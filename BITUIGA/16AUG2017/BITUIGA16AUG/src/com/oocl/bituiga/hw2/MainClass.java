package com.oocl.bituiga.hw2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) 
	{
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Bean1.xml");
        NetworkManager networkMng = (NetworkManager) context.getBean("netManager");
        context.close();
	}
}
