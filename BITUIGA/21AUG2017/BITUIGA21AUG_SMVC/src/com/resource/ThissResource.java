package com.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

@Path("/hello/{ip}")
public class ThissResource {

	public ThissResource() {
	// TODO Auto-generated constructor stub
	}
	
	@PathParam("ip") String ip;
	
	@GET
	@Produces("text/plain")
	public String hello() {
		
		GeoIPService ipService = new GeoIPService();
		GeoIPServiceSoap ipServiceSoap = ipService.getGeoIPServiceSoap(); 
		GeoIP geoIp = ipServiceSoap.getGeoIP(ip);
		
		String outStr ="";
		
		outStr += "IP Address: " + geoIp.getIP();
		outStr += "\n\nCountry Name: " + geoIp.getCountryName();
		outStr += "\n\nCountry Code: " + geoIp.getCountryCode();
//		outStr += "\n\n" + ;
		
//		System.out.println(geoIp.getCountryCode());
		
		
		return outStr;
	}

}