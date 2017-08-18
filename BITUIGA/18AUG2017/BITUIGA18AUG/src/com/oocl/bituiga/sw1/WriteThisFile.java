package com.oocl.bituiga.sw1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriteThisFile {
	
	private String fileName;
	Path file;
	
	public WriteThisFile(String fileName) {
		// TODO Auto-generated constructor stub
		this.fileName = fileName;
		file = FileSystems.getDefault().getPath("src", fileName);
	}
	

	public void createNewFile() {
		try {
		    Files.createFile(file);
		    System.out.println("File created.");
		} catch (FileAlreadyExistsException x) {
		    System.err.format("file named %s" +
		        "   ugh already exists%n", file);
		} catch (IOException x) {
		    // Some other sort of failure, such as permissions.
		    System.err.format("createFile error: %s%n", x);
		}
	}
	
	public void writeToFile(List<String> content) {
		Charset charset = Charset.forName("UTF-8");
		try (BufferedWriter writer = Files.newBufferedWriter(file, charset)) {
		    
		    for(int i = 0; i < content.size(); i++) {
		    	writer.write(content.get(i), 0, content.get(i).length());
		    	writer.newLine();
		    }
		    
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
	}
}
