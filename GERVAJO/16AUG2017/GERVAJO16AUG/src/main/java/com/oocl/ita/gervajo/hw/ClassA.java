package com.oocl.ita.gervajo.hw;

import com.oocl.ita.gervajo.hw.Order;

public class ClassA {
	
	Order order;

	public void setOrder(Order order) {
		this.order = order;
	}

	public void getOrder() {
		System.out.println("Item: " + order.getItem() + "\nPrice: " + order.getPrice());
	}
}
