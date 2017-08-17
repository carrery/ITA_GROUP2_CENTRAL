package com.oocl.bituiga.hw2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkManager {
     
		public HttpURLConnection connection;
		
	    public void init(){
	        String url = "http://www.bing.com";
	        URL thisUrl;
	        try {
	        	thisUrl = new URL(url);
	            connection = (HttpURLConnection) thisUrl.openConnection();
	            System.out.println("Connected");
	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
	    }
	     
	    public void destroy(){
	        try{
	            if(connection != null) {
	                connection.disconnect();
	                System.out.println("Disconnected");
	            }
	        } catch(Exception ex){
	             
	        }
	    }

}
