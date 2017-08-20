package com.oocl.ita.yapojo.sw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.Collator;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class SortInputOutputFile {

	public SortInputOutputFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String input = new String(Files.readAllBytes(Paths.get("C:\\Users\\yapojo\\git\\ITA\\TestEGit\\src\\com\\oocl\\ita\\yapo\\day15\\sampleexercise\\Sort.txt")));
			System.out.println(input);
			Files.write(Paths.get("C:\\Users\\yapojo\\Desktop\\Sort.txt"), input.getBytes(), StandardOpenOption.CREATE);
			List<String> output = Files.readAllLines(Paths.get("C:\\Users\\yapojo\\Desktop\\Sort.txt"));
			
			int num=0;
			int alpha=0;
			
			for(int a=0; a<output.size(); a++) {
				if(output.get(a).matches("[-+]?\\d*\\.?\\d*")) {
					num++;
				} else {
					alpha++;
				}
			}
			System.out.println(num + " " + alpha);

			Collections.sort(output);
			Files.write(Paths.get("C:\\Users\\yapojo\\Desktop\\Sort.txt"), output, StandardOpenOption.CREATE);
			System.out.println(output);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
