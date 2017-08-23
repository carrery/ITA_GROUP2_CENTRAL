package com.oocl.ita.yapo.sw;

public class testMavenClass {

	public testMavenClass() {
		// TODO Auto-generated constructor stub
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(addition(45, 2));
//		System.out.println(subtraction(100, 0));
//		System.out.println(multiplication(48, 2));
//		System.out.println(division(48, 2));
//		System.out.println(truncateAInFirst2Positions("AACD"));
//	}
	
	public static String number1() {
		String result = null;
		int i=1; 
		for (int j=0; j<5;j=j+2) 
		{ 
		  i= (i*i) +j; 
		} 
		switch (i)  
		{ 
		   case 3: 
		     //System.out.println ("zero"); 
		     result="zero";
		    break; 
		   case 13: 
		     //System.out.println ("one"); 
		     result="one";
		   case 175: 
		     //System.out.println ("two"); 
		     result="two";
		   default: 
		     //System.out.println ("default"); 
		     result="default";
		}
		return result; 
	}
	
	public static int number2() {
		int n; 
		int F_0=1,F_1=1; 
		int F_n=0; 
		System.out.println ("Enter the number"); 
		n=5; 
		for (int i=1; i<n; i++) { 
		     F_n=F_0+F_1; 
		     F_0=F_1; 
		     F_1=F_n; 
		} 
		return F_n; 
	}
	
	public static int number3() {
		int inner=2, outer=2; 
		int result=0; 
		 
		for (int i=0; i<outer; i++) 
		{ 
		  for (int j=0; j<inner; j++) 
		      { 
		        result = (result*result)+1; 
		      } 
		} 
		
		return result;
	}
	
	public static void number4() {
		int x;
		int y;
		x = 3; 
		y = 10; 
		while (x < y) {
			System.out.println ("Hello"); 
		     x = x + 1; 
		     y = y - 1; 
		}
	}
	
	public static int number7(int integer_value) {
		// Declare Local Variables  
		boolean done = false;  
		int count = 1;  
		int current = integer_value + 2;  
		while (! done) {  
		  current = current / count;  
		  if (current % 3 == 0)  
		    done = true;  
		  else if (current < 1)  
		    done = true;  
		  else  
		    count += 1;  
		  System.out.println(current);  
		}  
		System.out.println (count);  
		return count;  
		// method compute_value 
	}
	
	public static int addition(int x, int y) {
		return x + y;
	}
	
	public static int subtraction(int x, int y) {
		return x - y;
	}
	
	public static int multiplication(int x, int y) {
		return x * y;
	}
	
	public static int division(int x, int y) {
		return x / y;
	}
	
	public String truncateAInFirst2Positions(String str) {
		if (str.length() <=2) {
			return str.replaceAll("A", "");
		}
		String first2Chars = str.substring(0, 2);
		String stringMinusFirst2Chars = str.substring(2);
		
		return first2Chars.replaceAll("A", "") + stringMinusFirst2Chars;
	}
	
	public boolean areFirstAndLastTwoCharactersTheSame(String str) {
		if (str.length() <=1) {
			return false;
		}
		if (str.length() ==2) {
			return true;
		}
		
		String first2Chars = str.substring(0, 2);
		String last2Chars = str.substring(str.length() - 2);
		
		return first2Chars.equals(last2Chars);
	}


}
