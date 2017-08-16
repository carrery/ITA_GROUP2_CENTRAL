package com.oocl.bangipr.hw1;

public class Order extends ClassA {

	private Order order;

	public Order getOrder() {
		
		System.out.println(order);
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	public void getClassA() {
		this.order.getClassAOrder();
	}
	
	
}
