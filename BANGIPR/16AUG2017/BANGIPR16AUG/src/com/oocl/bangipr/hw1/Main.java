package com.oocl.bangipr.hw1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext ("Beans.xml");
		OrderList orders = (OrderList) context.getBean("orderList");
		orders.getOrder();

	}

}
