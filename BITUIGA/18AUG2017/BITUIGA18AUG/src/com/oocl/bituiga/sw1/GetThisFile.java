package com.oocl.bituiga.sw1;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class GetThisFile {
	
	public GetThisFile() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	public List<String> getLinesFromFile(String fileName){
		Charset charset = Charset.forName("UTF-8");
		List<String> theLines = new ArrayList<String>();
		Path file = FileSystems.getDefault().getPath("src", fileName);
		try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		    	theLines.add(line);
		    	System.out.println(line);
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		
		return theLines;
	}
	
}
