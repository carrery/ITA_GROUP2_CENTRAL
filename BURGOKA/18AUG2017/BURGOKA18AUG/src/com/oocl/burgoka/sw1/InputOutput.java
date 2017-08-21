package com.oocl.burgoka.sw1;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InputOutput {

	public InputOutput() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<String>();
		try {
			for(String line : Files.readAllLines(Paths.get("D:/sort.txt"))) {
				str.add(line);
			}
			
			Collections.sort(str);
			BufferedWriter out = new BufferedWriter(new FileWriter("D:/sorted.txt"));
			for(String sorted: str) {
				
				System.out.print(sorted + "\n");
				out.write(sorted);
				out.newLine();
			}
			
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
