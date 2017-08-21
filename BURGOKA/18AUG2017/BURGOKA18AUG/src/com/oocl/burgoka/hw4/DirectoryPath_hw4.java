package com.oocl.burgoka.hw4;

import java.io.*;
import java.util.Scanner;

public class DirectoryPath_hw4 {

	public DirectoryPath_hw4() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("A location in your hdd: ");
		String inputFile = in.nextLine();
		
		File folder = new File(inputFile);
		getFiles(folder);
		
	}

	private static void getFiles(File folder) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("D:/myFile.txt"));
			File files[];
			int cntFiles = 0;
			int cntDir = 0;
			files = folder.listFiles();
			
/*			if(folder.isFile()) {
				System.out.println("File: " + folder.getAbsolutePath().toString());
				out.write("File: " + folder.getAbsolutePath().toString());
				out.newLine();
			}
			else {
				for(int i = 0; i < files.length ; i++) {
					getFiles(files[i]);
				}
				//out.write("Total Directory Number: " + cnt);
				out.newLine();
				out.write("Total File Number: " + files.length);
				out.newLine();
				//System.out.println("Total Directory Number: " + cnt);
				System.out.println("Total File Number: " + files.length);
			}
	*/		
			for (File file : files) {
				if(file.isFile()) {
					cntFiles++;
				}
				if(file.isDirectory()) {
					cntDir++;
				}
			}
			
			System.out.println("Total Number of Directory / Subdirectory: " + cntDir);
			for (File file : files) {
				//System.out.println(file.getName());
				if(file.isDirectory()) {
					System.out.println("Folder: " + file.getAbsolutePath() + " " + file.getName());
					getFiles(file);
				}
			}
			
			System.out.println("Total Number of Files: " + cntFiles);
			for (File file : files) {
				//System.out.println(file.getName());
				if(file.isFile()) {
					System.out.println("File: " + file.getAbsolutePath() + " " + file.getName());
				}
			}
			
			out.flush();
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
