package com.oocl.ita.yapojo.hw;

import static java.nio.file.StandardOpenOption.*;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 // Convert the string to a
	    // byte array.
		System.out.print("Enter the File Name: ");
	    Scanner file = new Scanner(System.in);
	    String fileName = file.nextLine();
		
		System.out.print("Enter the String: ");
	    Scanner input = new Scanner(System.in);
	    String string = input.nextLine() + "\n";
	    
	    byte data[] = string.getBytes();
	    Path path = Paths.get("C:\\Users\\yapojo\\Desktop\\Test\\" + fileName + ".txt");

	    try (OutputStream output = new BufferedOutputStream(Files.newOutputStream(path, CREATE, APPEND))) {
	      output.write(data, 0, data.length);
	    } catch (IOException x) {
	      System.err.println(x);
	    }
	    
	    List<String> outputCopy = Files.readAllLines(path);
	    Files.write(Paths.get("C:\\Users\\yapojo\\Desktop\\Test\\Assignment7.txt"), outputCopy, CREATE, APPEND);
	}

}
