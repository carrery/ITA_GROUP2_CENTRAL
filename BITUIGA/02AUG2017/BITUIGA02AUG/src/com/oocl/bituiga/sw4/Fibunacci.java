package com.oocl.bituiga.sw4;

public class Fibunacci {

	public static void main(String args[]) {
		System.out.println("The fibunacci sequence is\n"); 
		//The Fibunacci sequence is 0 1 1 2 3 5 8 13 21 34 55 89 ...
		long currNum = 0 , nextNum = 1 , sumNum = 0;
		for(int o = 0; o < 92; o++){
			sumNum = currNum + nextNum;
			currNum = nextNum;
			nextNum = sumNum;
			System.out.print(currNum + ",");  
		}
		
	}
}
