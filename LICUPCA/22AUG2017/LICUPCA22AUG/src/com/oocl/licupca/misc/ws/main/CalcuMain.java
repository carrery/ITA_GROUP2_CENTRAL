package com.oocl.licupca.misc.ws.main;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.licupca.misc.ws.eq.Equation;
import com.oocl.licupca.misc.ws.impl.CalcuImpl;

@WebService
public class CalcuMain {
	
	static CalcuImpl calcuImpl = new CalcuImpl();

	public CalcuMain() {
		// TODO Auto-generated constructor stub
	}
	
	@WebMethod
	public double calculate(double x, String operator, double y) {
		return calcuImpl.getAnswer(x, operator, y);
	}
	

}
