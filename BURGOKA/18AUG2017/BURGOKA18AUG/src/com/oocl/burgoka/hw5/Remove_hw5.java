package com.oocl.burgoka.hw5;

import java.util.Scanner;

public class Remove_hw5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please input a string: ");
		String str = in.nextLine();
		
		str = str.replaceAll("[^\\w+$p{ASCII}]", "");
		System.out.println("Output: " + str);
	}
}
