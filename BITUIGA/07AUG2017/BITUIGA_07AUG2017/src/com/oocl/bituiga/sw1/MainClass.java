package com.oocl.bituiga.sw1;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		HolderClass<String> h1 = new HolderClass<String>();
		HolderClass<Integer> h2 = new HolderClass<Integer>();
		
		h1.addObject("A");
		h1.addObject("B");
		h1.addObject("C");
		
		h2.addObject(1);
		h2.addObject(2);
		h2.addObject(3);
		
		for(int i = 0; i < h1.getObjects().size(); i++) {
			System.out.println(h1.getMember(i));
		}
		
		for(Integer a : h2.getObjects()) {
			System.out.println(a);
		}
	}
}
