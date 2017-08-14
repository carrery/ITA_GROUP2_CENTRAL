package com.oocl.bangipr.sw2;

import java.util.Scanner;

public class FiboClass {
		
	public  long fibonacci(long num) {
		if(num == 0){
			return 0;
		}
		else if (num == 1 || num == 2) {
			return 1;
		}
 
		return fibonacci(num - 1) + fibonacci(num - 2); 
	}
	
	public  String method() {
		return "";
	}
	
	
	
}
