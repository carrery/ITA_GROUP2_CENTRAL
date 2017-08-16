package com.oocl.licupca.hw;

public class Order{
	
	private String item;
	private double price;
	private String address;
	
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void getDetails() {
		System.out.println("Item: " + getItem() + "\nPrice: $" + getPrice() + "\nAddress: " + getAddress());
	}

}
