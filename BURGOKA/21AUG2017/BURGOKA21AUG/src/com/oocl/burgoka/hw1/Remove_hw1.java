package com.oocl.burgoka.hw1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Path("/remove/{str}")
public class Remove_hw1 {

	public Remove_hw1() {
		// TODO Auto-generated constructor stub
	}
	
	@PathParam("str") String str;
	
	@GET
	@Produces("text/plain")
	public String remove() {
		str = str.replaceAll("[^\\w+$p{ASCII}]", "");
		//System.out.println("Output Result: " + str);
		return "Output Result: " + str;
		
	}

}