package com.oocl.burgoka.sw3;

public class Rodenrt {
	
	public String behave() {
		return "Cuter";
	}
	
	public static void main (String args[]) {
		Rodenrt rod[] = new Rodenrt[3];
		
		rod [0] = new Gerbil();
		rod [1] = new Hamster();
		rod [2] = new Mouse();
		
		for (int i = 0 ; i < 3 ; i++) {
			System.out.print(rod[i].behave());
		}
	}
}
