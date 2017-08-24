package com.resource;

import java.util.Scanner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/hw/{word}")
public class HwResource {
	@PathParam("word")
	String word;

	@GET
	@Produces("text/plain")
	public String hw() {
		String output = word.replaceAll(" ", "").replaceAll("[^\\p{ASCII}]", "");
		return "Output: " + output;
	}
}
