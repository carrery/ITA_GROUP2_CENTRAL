package com.oocl.licupca.hw;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		TextFile file = new TextFile();
		file.createFile();
	}

}

class TextFile {
	String fileName;
	String fileContent;

	public void createFile() {
		try {
			Scanner scanner = new Scanner(System.in);
			String line = null;
			ArrayList<String> SortedStringResult = new ArrayList<>();
			
			System.out.println("Enter file name: ");
			this.fileName = "D:\\" + scanner.nextLine() + ".txt";
			System.out.println("Enter file content: ");
			Writer writer = new OutputStreamWriter(new FileOutputStream(this.fileName), "utf-8");
			writer.write(this.fileContent = scanner.nextLine());
			writer.close();
			
			 Reader fileReader = new InputStreamReader(new FileInputStream("D:\\output.txt"), "utf-8");
	            BufferedReader bufferedReader = new BufferedReader(fileReader);
	            while((line = bufferedReader.readLine()) != null) {
	                SortedStringResult.add(line);
	            }   
	        bufferedReader.close();
            writer = new OutputStreamWriter(new FileOutputStream("D:\\output.txt"), "utf-8");
            for(String str: SortedStringResult) {
              writer.write(str + "\n");
            }
            writer.write(this.fileContent);
            
            writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("New file saved as " + this.fileName );
		}
	}
	
	public void copyFile() {
		
	}
	
	
}
