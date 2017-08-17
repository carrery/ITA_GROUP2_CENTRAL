package com.oocl.bangipr.hw1;

public class OrderList {


	private Order order;
	
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void getOrder() {
		System.out.println("Item: " + order.getItem()); 
		System.out.println("Price: " + order.getPrice()); 
		System.out.println("Address: " + order.getAddress());
	}

	public OrderList() {
		// TODO Auto-generated constructor stub
	}


}
