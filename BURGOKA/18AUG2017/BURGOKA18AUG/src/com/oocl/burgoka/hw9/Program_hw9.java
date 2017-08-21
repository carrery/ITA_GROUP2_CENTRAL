package com.oocl.burgoka.hw9;

import java.io.IOException;

public class Program_hw9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rs = Runtime.getRuntime();
		String player = "C:\\Program Files\\Windows Media Player\\wmplayer.exe";
		
	    try {
	      rs.exec("notepad");
	      rs.exec(player);
	    }
	    catch (IOException e) {
	      System.out.println(e);
	    }   
	}

}
