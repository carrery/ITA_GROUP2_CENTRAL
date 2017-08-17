package com.oocl.ita.gervajo.hw;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkManager {
	
	private String link;

	
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void init(){
		System.out.println("HTTP is going through initialization...");

	}

	public void destroy() {
		System.out.println("HTTP connection will be destroyed now.");
	}

}
