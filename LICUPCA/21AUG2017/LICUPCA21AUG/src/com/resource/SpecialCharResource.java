package com.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.app.SpecialChar;

@Path("/specialChar/{word}")
public class SpecialCharResource {
	
	@PathParam("word") String word;
	@GET
	@Produces("text/plain")
	public String hello() {
		return new SpecialChar(word).getResult();
	}
	
	
}
