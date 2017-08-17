package com.oocl.ita.yapojo.hw;

public class ClassA {
	
	private Order order;
	
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void getOrder() {
		System.out.println("Item: " + order.getItem() + "\nPrice: " + order.getPrice() + "\nCount: " + order.getCount());
	}

	public ClassA() {
		// TODO Auto-generated constructor stub
	}

}
