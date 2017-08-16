package com.oocl.bituiga.sw3;


public class CallRodents {
	
	public static void main(String args[]) {
		
		Rodent[] arrRodents = new Rodent[3];
		
		arrRodents[0] = new Mouse();
		arrRodents[1] = new Gerbil();
		arrRodents[2] = new Hamster();
		
		for(Rodent rodint: arrRodents) {
			rodint.introduceYourself();
		}
		
	}
}
