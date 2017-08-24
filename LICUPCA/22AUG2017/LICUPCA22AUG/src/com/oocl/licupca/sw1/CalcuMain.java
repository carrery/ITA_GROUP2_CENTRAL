package com.oocl.licupca.sw1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.bangipr.sw1.Calculator;
import com.oocl.bangipr.sw1.CalculatorService;
import com.oocl.licupca.misc.ws.eq.Equation;


public class CalcuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Equation equation= (Equation) context.getBean("equation");
		
//		String ipAddress = this.ip;
		CalculatorService calSer = new CalculatorService();
		Calculator cal = calSer.getCalculatorPort();
		System.out.println("Final answer: " + cal.addition(equation.getX(), equation.getY()));
	}

}
