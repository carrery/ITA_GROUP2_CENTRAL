package com.burgoka.oocl.sw1;

public class Exer1_Main {

	public static void main(String[] args) {
		System.out.println("Output: ");
		
		Exer1<String> ex = new Exer1<String>();
		ex.addObj("A");
		ex.addObj("B");
		ex.addObj("C");
		
		for(String res : ex.getObj()) {
			System.out.println(res);
		}
	}

}
