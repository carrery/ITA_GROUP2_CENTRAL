package com.oocl.bituiga.hw4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

public class FileCounter {

	public FileCounter() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		FileCounter e = new FileCounter();
		String filepat = "D:\\My Documents\\New folder";
		int countFolder = e.countFiles(filepat, true);
		int countFile = e.countFiles(filepat, false);
		
		System.out.println("Number of Folders : " + countFolder);
		e.printFiles(filepat,true);
		System.out.println("Number of Files : " + countFile);
		e.printFiles(filepat,false);
	}
	
	public int countFiles(String filePath, boolean isFolder) {
		File thisFile = new File(filePath);
		int count = 0;
		for(File fayl : thisFile.listFiles()) {
			if(isFolder && fayl.isDirectory()) count++;
			if(!isFolder && fayl.isFile()) count++;
		}
		return count;
	}
	
	
	
	public void printFiles(String filePath, boolean isFolder) {
		File thisFile = new File(filePath);
		for(File fayl : thisFile.listFiles()) {
			if(isFolder && fayl.isDirectory()) System.out.println(fayl.getName());
			if(!isFolder && fayl.isFile()) System.out.println(fayl.getName());
		}
	}

}
