package com.oocl.bangipr.hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class createAndCopyFile {

	public static void main(String[] args) throws IOException {
		File file = new File("resources/testFile1.txt");
		  
		if (file.createNewFile()){
		System.out.println("File is created!");
		}else{
		System.out.println("File already exists.");
		}
		 
		FileWriter writer = new FileWriter(file);
		writer.write("Test data \n");
		writer.write("Hello Hannah \n");
		writer.write("How are you? \n");
		writer.write("Have a nice day :D \n");
		
		writer.close();
		
		addFile();

	}
	
	public static void addFile() throws IOException {
		ArrayList<String> words = new ArrayList<String>();
		BufferedReader buffer = new BufferedReader(new FileReader("resources/testFile1.txt"));
		String w;
		while((w = buffer.readLine()) !=null) {
			words.add(w);
		}
		
			
		FileWriter write = new FileWriter("resources/testFile2.txt");
		for (String cur: words) {
		System.out.println(cur);
			write.write(cur + "\n");
		}
		
		buffer.close();
		write.close();
	}

}
