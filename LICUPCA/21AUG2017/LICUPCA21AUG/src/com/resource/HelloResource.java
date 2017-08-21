package com.resource;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.oocl.licupca.webservices.client.WebServiceIPLocation;


@Path("/hello/{ip}")
public class HelloResource {
	
	@PathParam("ip") String ip;
	@GET
	@Produces("text/plain")
	public String hello() {
		return new WebServiceIPLocation(ip).getCountry();
	}
	
	
}
