package com.oocl.burgoka.sw1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InOut_sw1 {
	public static void main(String[] args) {
		ArrayList<Sort> str = new ArrayList<Sort>();
		try {
			for(String line : Files.readAllLines(Paths.get("D:/sort.txt"))) {
				str.add(new Sort(line));
			}
			
			BufferedWriter out = new BufferedWriter(new FileWriter("D:/sorted.txt"));
			for(Sort sorted: str) {
				
				System.out.print(sorted + "\n");
				out.write(sorted.toString());
				out.newLine();
			}
			
			out.flush();
			out.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}	
