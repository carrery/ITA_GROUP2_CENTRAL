package com.oocl.burgoka.hw1;

public class ClassA {

	public ClassA() {
		// TODO Auto-generated constructor stub
	}

	private Order order;
	
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void getOrder() {
		System.out.println("Item: " + order.getItem() + "\nPrice: " + order.getPrice());
	}
}
