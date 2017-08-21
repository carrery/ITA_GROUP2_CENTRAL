package com.oocl.bangipr.hw1;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/search")
public class ResourceClass {


	public static ArrayList<String> backup = new ArrayList<String>();
	@GET
	@Produces("text/html")
	public String search() {
		ArrayList<String> normalEnglish = new ArrayList<String>();
		normalEnglish.add("haha");
		normalEnglish.add("hannah");
		normalEnglish.add("cake");
		normalEnglish.add("movies");
		normalEnglish.add("GoT");
		normalEnglish.add("hannah");
		
		backup.add("haha");
		backup.add("hannah");
		backup.add("cake");
		backup.add("movies");
		backup.add("GoT");
		backup.add("hannah");
		
		ArrayList<String> notEnglish = new ArrayList<String>();
		notEnglish.add("你好吗");
		notEnglish.add("喂");
		notEnglish.add("对不起");
		notEnglish.add("谢");
		notEnglish.add("你好吗");
		notEnglish.add("多少钱");
		
	//	backup = normalEnglish;
		
		return removeDup(normalEnglish);
	//	removeDup(notEnglish);
	
	
	
	}
	
	public static String removeDup(ArrayList<String> list) {
		int index = 0;
		//ArrayList<String> back2 = back;

	    int count = 0;

	    while (index < list.size() - 1) {
	        String item = list.get(index);

	        List<String> tail = list.subList(index + 1, list.size());

	        while (tail.contains(item)) {
	            tail.remove(item);
	            count++;
	        }
	        index++;
	    }

	    System.out.println(backup);
	    return "<html><head><title>Homework 1</title> <h1>Remove duplicate list</h1></head>"
	    		+ "<body><h2>Original list is : </h2> </br><p>"+ backup + 
	    		"</p></br></br><h2>New List is : </h2> </br></h4>"+list+"</h4></body></html>";
	    
	    
	}
	
	
}
