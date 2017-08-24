package com.oocl.bangipr.sw2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.bangipr.sw1.NewCalculator;

public class Main {
	public static void main (String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		NewCalculator calcs = (NewCalculator) context.getBean("calcu");
		
		System.out.println(calcs.getCalc(5, "+", 6));
		
		
	
}

}
