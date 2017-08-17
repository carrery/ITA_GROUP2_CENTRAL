package com.oocl.ita.yapojo.hw;

import java.net.URL;
import java.net.URLConnection;

public class NetworkManager {
	
	public HttpConnection getHttpConnection() {
		return httpConnection;
	}

	public void setHttpConnection(HttpConnection httpConnection) {
		this.httpConnection = httpConnection;
	}

	HttpConnection httpConnection;
	
	public NetworkManager() {
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		this.httpConnection.Open();
	}
	
	public void destroy() {
		this.httpConnection.Close();
	}

}
