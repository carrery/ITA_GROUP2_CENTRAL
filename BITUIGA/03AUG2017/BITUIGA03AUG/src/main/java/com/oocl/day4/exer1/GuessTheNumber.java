package com.oocl.day4.exer1;
import java.util.Random;
import java.util.Scanner; 

public class GuessTheNumber {
	
	public static boolean ifCorrect = true;
	public int theNum;
	
	public GuessTheNumber() {		
		Random rand = new Random(); 
		theNum = rand.nextInt(100);
	}
	
	public boolean compareNumbers(Integer guess) {		
		
		
		if (guess == theNum ) {
			System.out.println("Correct!");
			return true;
		}
		else {
			if(guess > theNum) System.out.println("Lower!");
			else System.out.println("Higher!");
			System.out.println("Guess again:");
			return false;
		}  
	}
	
	public static void main(String args[]) {
		
		System.out.println("Guess the Number from 1 - 100");
		GuessTheNumber g = new GuessTheNumber();
		do { 			
			g.compareNumbers(Integer.valueOf(new Scanner(System.in).nextLine())); 
		} while(!g.ifCorrect);
	}
	
}
