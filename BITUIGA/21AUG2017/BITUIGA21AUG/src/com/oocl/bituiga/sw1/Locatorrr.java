package com.oocl.bituiga.sw1;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class Locatorrr {

	
	public Locatorrr() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		if(args.length != 1) 
		{
			System.out.println("No Args");
		}
		else {
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap ipServiceSoap = ipService.getGeoIPServiceSoap(); 
			GeoIP geoIp = ipServiceSoap.getGeoIP(args[0]);
			System.out.println(geoIp.getCountryCode());
			
		}
	}
	
}
