package com.oocl.licupca.webservices.client;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class WebServiceIPLocation {
	
	private String ip;
	private String country;

	public WebServiceIPLocation(String ip) {
		setIp(ip);
		setCountry();
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry() {
		String ipAddress = this.ip;
		GeoIPService ipService = new GeoIPService();
		GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
		GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
		
		this.country = geoIP.getCountryName();
	}
	
}
