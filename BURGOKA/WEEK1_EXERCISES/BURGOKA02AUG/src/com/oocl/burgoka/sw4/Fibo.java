package com.oocl.burgoka.sw4;

public class Fibo {
	public static void main (String args[]) {
		//int n = ; 
		int a = 0;
	    int b = 1;
	    System.out.println(b);
	           for (int i = 0; i < 100; i++) {
	               int num = a + b;
	               //System.out.print(num + "\n");
	               //a = b;
	               //b = num; 
	               
	               if(num < 100) {
	            	   System.out.print(num + "\n");
	            	   a = b;
		               b = num;
	               }
	           }
	       }
	
}
