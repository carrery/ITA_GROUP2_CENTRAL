package com.oocl.bituiga.sw1.webservice.business;

import java.util.*;

public class MyCalculatorImpl {
	
	private String operand;
	private String equation;
	public List<Double> numList = new ArrayList<>();
	
	
	public MyCalculatorImpl () {
		
	}
	
	public String getEquation() {
		return equation;
	}

	public void setEquation(String equation) {
		this.equation = equation;
	}
	
	public Double getResult() {
		Double result= 0.0;
		if(this.operand.equals("*") || this.operand.equals("/") ) result = 1.0;
		for(Double num : this.numList) {
			if(this.operand.equals("+")) result+= num;
			if(this.operand.equals("-")) result-= num;
			if(this.operand.equals("*")) result*= num;
			if(this.operand.equals("/")) result/= num;
		}
		return result;
	}
	
	
	public void initCalculator(String equation) {
		
		equation = equation.replaceAll(" ", "");
		for(String d : equation.split("") )
		{
			if(d.equals("+")) {
				this.operand = "+";
				break;
			}
			if(d.equals("-")) {
				this.operand = "-";
				break;
			}
			if(d.equals("*")) {
				this.operand = "*";
				break;
			}
			if(d.equals("/")) {
				this.operand = "/";
				break;
			}
		}
		System.out.println(equation);
		String[] tempArr = equation.split("["+this.operand+"]");
		for(String nums : tempArr) {
			numList.add(Double.valueOf(nums));
		}
	}



	
	
}
