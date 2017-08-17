package com.oocl.burgoka.hw2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.burgoka.hw2.NetworkManager;

public class NetworkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("hw2_bean.xml");
        NetworkManager networkMng = (NetworkManager) context.getBean("netManager");
        ((AbstractApplicationContext) context).registerShutdownHook();
	}

}
