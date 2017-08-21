package com.oocl.bituiga.hw9;

import java.io.IOException;

public class OpenThisFile {

	public OpenThisFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Runtime.getRuntime().exec("notepad.exe"); 
			Runtime.getRuntime().exec("cmd /c start \"%programfiles%\\Windows Media Player\\wmplayer.exe\" \"D:\\gitvob\\ITA_G2\\ITA-MNL_GROUP2\\BITUIGA\\18AUG2017\\BITUIGA18AUG\\src\\song.mp3\""); 

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
