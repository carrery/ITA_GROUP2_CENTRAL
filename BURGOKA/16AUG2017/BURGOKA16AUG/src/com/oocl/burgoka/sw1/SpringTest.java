package com.oocl.burgoka.sw1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
		//AbstractApplicationContext
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloSpring obj = (HelloSpring) context.getBean("helloSpring");
		HelloSpring obj2 = (HelloSpring) context.getBean("helloSpring");
		obj.setMessage("~Charooooot");
		//obj.getMessage();
		obj2.getMessage();
	}
	
}

