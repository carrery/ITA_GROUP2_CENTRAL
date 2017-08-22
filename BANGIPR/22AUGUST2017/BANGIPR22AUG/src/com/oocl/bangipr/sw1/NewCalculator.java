package com.oocl.bangipr.sw1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.bangipr.sw2.CalculatorStuff;
import com.oocl.licupca.misc.ws.main.CalcuMain;
import com.oocl.licupca.misc.ws.main.CalcuMainService;

public class NewCalculator {
	
	public static void main(String[] args) {
			
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		CalculatorStuff calcs = (CalculatorStuff) context.getBean("calcu");
		
		CalcuMainService calc = new CalcuMainService();
		CalcuMain calcMain = calc.getCalcuMainPort();
		double cal = calcMain.calculate(calcs.getX(), calcs.getOps(), calcs.getY());

		System.out.println("Answer is " +cal);
		
	}

}
