package com.oocl.bangipr.hw5;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input anything!:");
		String n = input.nextLine();
		String sol = n.replaceAll("[^a-zA-Z]+", " ");

			System.out.println(sol);
		
		

	}

}
