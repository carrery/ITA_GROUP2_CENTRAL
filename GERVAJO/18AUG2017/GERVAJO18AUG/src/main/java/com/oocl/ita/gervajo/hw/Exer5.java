package com.oocl.ita.gervajo.hw;

import java.util.Scanner;

public class Exer5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input string: ");
		String input = sc.nextLine();
		String output = input.replaceAll(" ", "").replaceAll("[^\\p{ASCII}]", "");
		System.out.println(output);
	}
}
