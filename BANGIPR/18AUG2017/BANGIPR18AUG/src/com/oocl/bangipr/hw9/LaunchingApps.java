package com.oocl.bangipr.hw9;

import java.io.IOException;

public class LaunchingApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Runtime runtime = Runtime.getRuntime();   
		 String[] s = new String[] {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", "http://www.bing.com/"};
		 
	        try
	        {
	           System.out.println("opening notepad");
	           runtime.exec("notepad.exe");
	           System.out.println("opening chrome");
	           runtime.exec(s);
	 
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }

	}

}
