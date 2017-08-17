package com.oocl.bangipr.hw2;

import java.net.URL;
import java.net.URLConnection;

/**
 * You can define initialization and destroy methods with in the spring bean. You can configure it using init-method, and destroy-method in the xml based configuration file. These are part of spring bean life cycle. The initialization method will be called immediately after bean creation, and destroy method will be called before killing the bean instance. Create a class Network Manager that has an init() method which initializes http connection object, and then the destroy() method that will close the http connection.

 * @author BANGIPR
 *
 */
public class NetworkManager {
	
	public Http getHttp() {
		return getHttp();
	}

	public void setHttpConnection(Http httpConnection) {
		this.httpConnection = httpConnection;
	}

	Http httpConnection;
	
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
