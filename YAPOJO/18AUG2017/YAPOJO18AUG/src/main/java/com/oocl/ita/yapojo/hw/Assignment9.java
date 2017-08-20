package com.oocl.ita.yapojo.hw;

import java.io.IOException;

public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime run = Runtime.getRuntime();

		try {
			run.exec("notepad");
			run.exec("C:\\Program Files (x86)\\Windows Media Player\\wmplayer.exe");
		} catch (IOException e) {
			System.out.println(e);
		}   

	}

}
