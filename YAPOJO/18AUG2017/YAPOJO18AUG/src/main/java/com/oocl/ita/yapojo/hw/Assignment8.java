package com.oocl.ita.yapojo.hw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>(); 
		System.out.print("Enter the String: ");
	    Scanner input = new Scanner(System.in);
	    String string = input.nextLine();
	    
	    while(!string.equalsIgnoreCase("terminate")) {
	    	list.add(string);
	    	System.out.print("Enter the String: ");
		    Scanner input2 = new Scanner(System.in);
		    string = input.nextLine();
	    }
	    
	    Set<String> fixedList  = new HashSet<String>();
	    fixedList.addAll(list);
	    list.clear();
	    list.addAll(fixedList);
	    
	    for(String str : list) {
	    	System.out.println(str);
	    }
	    
	    
	    
	    
	}

}
