package com.oocl.bangipr.hw1;

public class Order extends OrderList {

	private String item;
	 private String price;
	 private String address;
	 
	    public String getItem() {
	        return item;
	    }
	    public void setItem(String item) {
	        this.item = item;
	    }
	    public String getPrice() {
	        return price;
	    }
	    public void setPrice(String price) {
	        this.price = price;
	    }
	    public String getAddress() {
	        return address;
	    }
	    public void setAddress(String address) {
	        this.address = address;
	    }
	
	public Order() {
		
	}
	
	
}
