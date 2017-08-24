package com.resource;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class ThissResource {

	public ThissResource() {
	// TODO Auto-generated constructor stub
	}
	
	@GET
	@Produces("text/plain")
	public String hello() {
		
		String expectedOutput = "Initial List: \n";
		ArrayList<String> stringArray = new ArrayList<String>();
		ArrayList<String> removeList = new ArrayList<String>();
		int n = 0;
		System.out.println("How many strings?");
		Scanner nn = new Scanner(System.in);
		n = nn.nextInt();
		
		for(int i = 0; i < n; i++ ) {
			System.out.println("Please input string " + (i+1) + " : ");
			Scanner ss = new Scanner(System.in);
			String e = ss.nextLine();
			stringArray.add(e);
			expectedOutput += e + "\n";
		}
		
		stringArray =  (ArrayList<String>)stringArray.stream().distinct().collect(Collectors.toList());
		
		for(String s : stringArray) {			
			s = s.replaceAll(" ", "");
			for(char a : s.toCharArray()) {
				if (!CharChecker.isPureAscii(a)) {
					removeList.add(s);
				}
			}
		}
		
		for(String a : removeList) {
			stringArray.remove(a);
		}
		expectedOutput += "\nProcessed List: \n";
		for(String a : stringArray) {
			expectedOutput += a + "\n";
		}
	    
		return expectedOutput;
	}

}