package com.oocl.bangipr.sw2;

public class CalculatorStuff {
	
	
	private Integer x;
	private Integer y;
	private String ops;


	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	public String getOps() {
		return ops;
	}
	public void setOps(String ops) {
		this.ops = ops;
	}
	 public void printThrowException(){
	      System.out.println("Exception raised");
	      throw new IllegalArgumentException();
	   }
	
	
}
