package com.oocl.bangipr.sw1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorImp {
	double x, y;

	
	public CalculatorImp() {
		x=3;
		y=2;
	}
	
	public Double getSum(double x2, double y2) {
	//	logger.debug("User is using addition");
		double sum;
		
		sum = x2 +y2;
		return sum ;
		
	}
	
	public Double getDifference(double x , double y){
		double difference;
		
		difference = x-y;
		
		return difference;
		
	}
	
	public Double getProduct(double x , double y){
		double product;
		
		product = x*y;
		System.out.println(product);
		return product; 
		
	}
	
	public Double getQuotient(double x , double y){
		double quotient;
		
		quotient = (x/y);
		
		return quotient;
		
	}
	
	


}
