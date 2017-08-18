package com.oocl.bituiga.sw1;

import java.util.Collections;
import java.util.List;

public class SortThisFile {
	
	
	public static void main(String[] args) {
		GetThisFile newGetter = new GetThisFile();
		
		List<String> inputLines = newGetter.getLinesFromFile("Input.txt");
		Collections.sort(inputLines);
		
		WriteThisFile newWriter = new WriteThisFile("Output.txt");
		newWriter.createNewFile();
		newWriter.writeToFile(inputLines);
		
		
		
	}
	
}
