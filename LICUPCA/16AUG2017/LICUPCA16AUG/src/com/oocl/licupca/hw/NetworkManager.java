package com.oocl.licupca.hw;


public class NetworkManager {
	private HttpConnection httpConnection;
	public HttpConnection getHttpConnection() {
		return httpConnection;
	}

	public void setHttpConnection(HttpConnection httpConnection) {
		this.httpConnection = httpConnection;
	}
	
	public void init() {
		this.httpConnection.open();
	}
	
	public void destroy() {
		this.httpConnection.close();
	}

}
