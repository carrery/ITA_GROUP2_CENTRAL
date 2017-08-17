package com.oocl.bituiga.hw1;

public class A {

	public A() {
		// TODO Auto-generated constructor stub
	}

	private Order order;
	
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void getOrder() {
		System.out.println("Item: " + order.getItemName() + "\nPrice: PHP " + order.getItemPrice());
	}
}
