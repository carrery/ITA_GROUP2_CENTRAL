package com.oocl.ita.yapojo.hw;

import java.net.URL;
import java.net.URLConnection;

public class NetworkManager {
	
	private String link;
	private URL httpUrl;
	
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public URL getHttpUrl() {
		return httpUrl;
	}

	public void setHttpUrl(URL httpUrl) {
		this.httpUrl = httpUrl;
	}

	public URLConnection getUrlConn() {
		return urlConn;
	}

	public void setUrlConn(URLConnection urlConn) {
		this.urlConn = urlConn;
	}

	private URLConnection urlConn;

	public NetworkManager() {
		// TODO Auto-generated constructor stub
	}

}
