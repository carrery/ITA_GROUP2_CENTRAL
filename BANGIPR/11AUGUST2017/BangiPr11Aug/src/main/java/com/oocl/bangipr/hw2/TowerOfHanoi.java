package com.oocl.bangipr.hw2;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input number if disks (3-10): ");
		int disks = input.nextInt();

		move(disks, 1, 3);
	}
	
	  public static void move(int n, int startPole, int endPole) {
	      if (n== 0) {
	         return;
	      } 
	      int intermediatePole = 6 - startPole - endPole;
	      move(n-1, startPole, intermediatePole);
	      System.out.println("Move " +n + " from " + startPole + " to " +endPole);
	      move(n-1, intermediatePole, endPole);
	      
	      
	   } 
	  
	  

}
