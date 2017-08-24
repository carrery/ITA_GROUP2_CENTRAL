package com.oocl.burgoka.hw2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Path("/list/{str}")
public class List_hw2 {

	public List_hw2() {
		// TODO Auto-generated constructor stub
	}
	
	@PathParam("str1") String str1;
	
	@GET
	@Produces("text/plain")
	public String list() {
		String regex = "\\w*";
		ArrayList<String> str = new ArrayList<String>();
		List<String> res = new ArrayList<String>();
		str.add("AB");
		str.add("AB");
		str.add("CD");

		str.add(str1);
		
		if(str1.matches(regex)) {
			str.remove(str1);
			res = str.stream().distinct().collect(Collectors.toList());
		}
		else {
			res = str.stream().distinct().collect(Collectors.toList());
		} 
		
		return res.toString();
		
	}

}