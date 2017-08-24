package com.oocl.ita.gervajo.ws;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.ita.gervajo.ws.Calculator;
import com.oocl.ita.gervajo.ws.business.CalcImpl;
import com.oocl.ita.yapo.day17.webservice.CalculatorApplication;
import com.oocl.ita.yapo.day17.webservice.CalculatorApplicationService;

@WebService
public class CalcCatalogue {

	CalcImpl CalcImpl = new CalcImpl();

	@WebMethod
	public List<String> getCalcMethods() {
		// return productService.getProductCategories();
		List<String> actions = new ArrayList<>();
		actions.add("Add (+)");
		actions.add("Subtract (-)");
		actions.add("Multiply (*)");
		actions.add("Divide (/)");
		return actions;
	}

	public double getAnswer(double firstNum, String operation, double secondNum) throws IOException {
		//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		//Calculator c = (Calculator) context.getBean("calc");

		//CalculatorApplicationService cas = new CalculatorApplicationService();
		//CalculatorApplication ca = cas.getCalculatorApplicationPort();
		//double answer = ca.getCalculation(c.getFirstNum(), c.getOperation(), c.getSecondNum());
		//return calcService.getAnswer(c.getOperation(), c.getFirstNum(), c.getSecondNum());
		
		
		return CalcImpl.getAnswer(operation,firstNum,secondNum);
	}
}
