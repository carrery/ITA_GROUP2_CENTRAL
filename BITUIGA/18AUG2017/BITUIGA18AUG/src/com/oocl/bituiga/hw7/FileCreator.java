package com.oocl.bituiga.hw7;

import java.util.ArrayList;
import java.util.List;

import com.oocl.bituiga.sw1.GetThisFile;
import com.oocl.bituiga.sw1.WriteThisFile;

public class FileCreator {

	public FileCreator() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
	GetThisFile newGetter = new GetThisFile();
	
	List<String> initInput = new ArrayList<>();
	initInput = fillList();
				
		WriteThisFile newWriter = new WriteThisFile("Exercise6.txt");
		newWriter.createNewFile();
		newWriter.writeToFile(initInput);
		
		List<String> inputLines = newGetter.getLinesFromFile("Exercise6.txt");
		
		WriteThisFile newWriter2 = new WriteThisFile("Exercise6_2.txt");
		newWriter2.createNewFile();
		
		newWriter2.writeToFile(inputLines);
	}
	
	static List<String> fillList(){
		List<String> initInput = new ArrayList<>();
		initInput.add("test");
		initInput.add("meoasdw");
		initInput.add("meafow");
		initInput.add("mfaeow");
		initInput.add("megdow");
		initInput.add("mesdddow");
		initInput.add("meow222");
		return initInput;
	}

}
