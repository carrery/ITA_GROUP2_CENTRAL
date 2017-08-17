package com.oocl.ita.gervajo.hw;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainNetwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		NetworkManager netMan = (NetworkManager) context.getBean("netMan");
		context.registerShutdownHook();
		

	}

}
