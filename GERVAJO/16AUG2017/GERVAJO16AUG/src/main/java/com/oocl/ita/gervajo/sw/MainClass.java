package com.oocl.ita.gervajo.sw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Shape sh = (Shape) context.getBean("shape");
		sh.draw();
		
		Shape sh2 = (Shape) context.getBean("shape2");
		sh2.draw();

	}

}
