package com.oocl.bituiga.sw2;

public class ThreadCaller {

	public ThreadCaller() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Sinulid[] trd = new Sinulid[5]; 
		for(int i = 0; i < 5; i++) {
			trd[i] = new Sinulid(i+1,i);
			System.out.println("Thread " + (i+1) + "has been created.");
			trd[i].start();
		}
		
//		for(Sinulid trds : trd) {
//			trds.start();
//		}
	}
	
}
