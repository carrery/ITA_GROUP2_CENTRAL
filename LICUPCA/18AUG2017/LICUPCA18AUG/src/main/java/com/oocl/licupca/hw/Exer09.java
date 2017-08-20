package com.oocl.licupca.hw;

import java.io.IOException;

public class Exer09 {
	public static void main(String[] args) {
		runNotepad();
		runWMP();
	}
	
	public static void runNotepad() {
		try {
			System.out.println("Opening notepad");
			Runtime runTime = Runtime.getRuntime();
			Process process = runTime.exec("notepad");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Closing notepad");
			process.destroy();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void runWMP() {
		try {
			System.out.println("Opening WMP");
			Runtime runTime = Runtime.getRuntime();
			Process process = runTime.exec("C:\\Program Files (x86)\\Windows Media Player\\wmplayer.exe");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Closing WMP");
			process.destroy();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
