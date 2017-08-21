package com.oocl.ita.gervajo.hw;

import java.io.IOException;

public class Exer9 {
	public static void main(String[] args) {
		Runtime rs = Runtime.getRuntime();

		try {
			rs.exec("notepad");
			rs.exec("C:\\Program Files (x86)\\Windows Media Player\\wmplayer.exe");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
