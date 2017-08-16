package regx;

import java.util.Scanner;

public class RegularEx {
	public static void main(String[] args) {	
		
		System.out.println("Save Username:");
		Scanner s = new Scanner(System.in);  
		String username = s.nextLine(); 
		
		if(validateString(username)) System.out.println("meow");
		
		System.out.println("Save Password:");
		Scanner q = new Scanner(System.in);  
		String pWord = q.nextLine(); 
//		
		System.out.println("*************************************************************************");
		System.out.println("*************************************************************************");
		System.out.println("*************************************************************************");
		
		System.out.println("Username must be in alphanumneric only\n");
		
		System.out.println("Enter Username:");
		Scanner w = new Scanner(System.in);  
		String eUserName = w.nextLine(); 
		
		System.out.println("Enter Password:");
		Scanner e = new Scanner(System.in);  
		String ePWord = e.nextLine(); 
		
		System.out.println("*************************************************************************");
		System.out.println("*************************************************************************");
		System.out.println("*************************************************************************");
		
		Scanner v = new Scanner(System.in);  
		String lol = v.nextLine(); 
		
		
		if(eUserName.matches(getRegExForString(eUserName))) {
			System.out.println("YEHEY");
		}
		else {
			System.out.println("NOPE");
		}
//		System.out.println();
//		if() {
//			
//		}
		
	}
	
	public static String getRegExForString(String convertThis) {
		String returnString = "";
		
		for(String a : convertThis.split("")) {
			returnString += "[" + a.toLowerCase() + a.toUpperCase() + "]";
		}
		return returnString;
	}
	
	public static boolean validateString(String validateThis) {
		
		return validateThis.matches("[a-Z0-9]");
	}
}
