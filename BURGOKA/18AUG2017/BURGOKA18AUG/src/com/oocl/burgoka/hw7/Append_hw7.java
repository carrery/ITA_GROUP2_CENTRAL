package com.oocl.burgoka.hw7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Append_hw7 {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<String>();
		try {
			for(String line : Files.readAllLines(Paths.get("D:/write.txt"))) {
				str.add(line);
			}
			
			FileWriter out = new FileWriter(("D:/append.txt"), true);
			for(String app: str) {
				System.out.print(app + "\n");
				out.append(app.toString());
				out.write(System.getProperty( "line.separator" ));
			}
			
			out.flush();
			out.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
