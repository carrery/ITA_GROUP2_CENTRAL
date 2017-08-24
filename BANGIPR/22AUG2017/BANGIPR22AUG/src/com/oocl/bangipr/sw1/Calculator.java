package com.oocl.bangipr.sw1;

import java.net.InetAddress;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceContext;


import javax.xml.ws.handler.MessageContext;

@WebService
public class Calculator {
	
	
	@Resource WebServiceContext wsContext; 
	
	static CalculatorImp calc = new CalculatorImp();
	InetAddress thisIp;
	
	@WebMethod(operationName = "check")
	public String getID(){	
		
	    MessageContext mc = wsContext.getMessageContext();
	    HttpServletRequest req = (HttpServletRequest)mc.get(MessageContext.SERVLET_REQUEST); 
	    System.out.println("Client IP = " + req.getRemoteAddr() +" ----" +  req.getRemotePort()); 
		
		return " --- "+ req.getRemoteAddr() +" ----" +  req.getRemotePort() + " ----" + req.getRemoteHost();
		
	}
	
	
	@WebMethod(operationName = "Addition")
	public Double getSum(double  x , double y){	
		return calc.getSum(x, y);
		
	}
	
	
	@WebMethod(operationName = "Subtraction")
	public Double getDifference(double x , double y){

		return calc.getDifference(x, y);
	}
	
	@WebMethod(operationName = "Multiplication")
	public Double getProduct(double x , double y){

		return calc.getProduct(x, y);
		
	}
	
	@WebMethod(operationName = "Division")
	public Double getQuotient(double x , double y){

		return calc.getQuotient(x, y);
	}
	
	
	

}
