package com.oocl.licupca.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainNetworkAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("NetworkConfig.xml");
		NetworkManager netMan = (NetworkManager) context.getBean("netMan");
		
		((AbstractApplicationContext) context).close();
		
	}

}

