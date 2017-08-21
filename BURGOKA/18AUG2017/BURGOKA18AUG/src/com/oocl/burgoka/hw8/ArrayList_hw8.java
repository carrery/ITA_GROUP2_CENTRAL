package com.oocl.burgoka.hw8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayList_hw8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String regex = "[^\\w+$p{ASCII}]";
		String regex1 = "\\w*";
		ArrayList<String> str = new ArrayList<String>();
		str.add("AB");
		str.add("AB");
		str.add("CD");
		
		System.out.println("Duplicate: " + str);
		System.out.println("Distinct: " + str.stream().distinct().collect(Collectors.toList()));
		
		System.out.println("Try to input string: ");
		Scanner in = new Scanner(System.in);
		String strInput1 = in.nextLine();
		String strInput2 = in.nextLine();
		
		str.add(strInput1);
		str.add(strInput2);
			
		if(strInput1.matches(regex1) && strInput2.matches(regex1)) {
			if(strInput1.equals(strInput2)) {
				System.out.println("Distinct: " + str.stream().distinct().collect(Collectors.toList()));
			}
			else {
				System.out.println("Distinct: " + str.stream().distinct().collect(Collectors.toList()));
			}
		}
		else {
			if(strInput1.equals(strInput2)) {
				str.remove(strInput1);
				str.remove(strInput2);
				System.out.println("Distinct: " + str.stream().distinct().collect(Collectors.toList()));
			}
			else {
				if(strInput1.matches(regex1)) {
					str.add(strInput1);
					System.out.println("Distinct: " + str.stream().distinct().collect(Collectors.toList()));
				}
				else if(strInput2.matches(regex1)) {
					str.add(strInput2);
					System.out.println("Distinct: " + str.stream().distinct().collect(Collectors.toList()));
				}
				else {
					str.remove(strInput1);
					str.remove(strInput2);
					System.out.println("Distinct: " + str.stream().distinct().collect(Collectors.toList()));
				}
			}
			
		}
		
	}

}
