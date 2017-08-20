package com.oocl.bituiga.hw10;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import com.oocl.bituiga.sw1.WriteThisFile;

public class FileDownloader {

	public FileDownloader() {
		// TODO Auto-generated constructor stub
	}
	 public static void main(String[] args) {
		 
		 try {
		 URL url = new URL("http://www.bing.com/");
		 URLConnection con = url.openConnection();
		 InputStream in = con.getInputStream();
		 String encoding = con.getContentEncoding();  // ** WRONG: should use "con.getContentType()" instead but it returns something like "text/html; charset=UTF-8" so this value must be parsed to extract the actual encoding
		 encoding = encoding == null ? "US-ASCII" : encoding;
	
		 
		 ByteArrayOutputStream baos = new ByteArrayOutputStream();
		 byte[] buf = new byte[8192];
		 int len = 0;
		 while ((len = in.read(buf)) != -1) {
		     baos.write(buf, 0, len);
		 }
		 String body = new String(baos.toByteArray(), encoding);
		 ArrayList<String> inputLines = new ArrayList<String>();
		 inputLines.add(body);
		 
		 WriteThisFile newWriter = new WriteThisFile("Number10.html");
		newWriter.createNewFile();
		newWriter.writeToFile(inputLines);
		 
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}
}
