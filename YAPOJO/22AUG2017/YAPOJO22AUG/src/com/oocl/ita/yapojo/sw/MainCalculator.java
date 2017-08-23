package com.oocl.ita.yapojo.sw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.ita.gervajo.ws.CalcCatalogue;
import com.oocl.ita.gervajo.ws.CalcCatalogueService;

public class MainCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Calculator calculator = (Calculator) context.getBean("calculator");
		
		CalcCatalogueService calc = new CalcCatalogueService();
		CalcCatalogue calcu = calc.getCalcCataloguePort();
		
		System.out.println(calcu.getAnswer(calculator.getNumber1(), calculator.getOperation(), calculator.getNumber2()));
	}

}
