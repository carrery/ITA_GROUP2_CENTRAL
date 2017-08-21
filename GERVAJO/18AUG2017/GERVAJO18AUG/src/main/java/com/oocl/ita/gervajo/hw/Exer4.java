package com.oocl.ita.gervajo.hw;

import java.io.File;
import java.io.FileFilter;

public class Exer4 {

	public static void main(String[] args) {
		File dir = new File("D:\\");
		File[] files = dir.listFiles();
		File[] files2 = dir.listFiles();
		FileFilter filedir = new FileFilter() {
			public boolean accept(File file) {
				return file.isDirectory();
			}
		};
		FileFilter filelist = new FileFilter() {
			public boolean accept(File file) {
				return file.isFile();
			}
		};
		files = dir.listFiles(filedir);
		files2 = dir.listFiles(filelist);
		
		System.out.println("Total Diretory Number: " + files.length);

		if (files.length == 0) {
			System.out.println("No folders found in the directory");
		} else {
			for (int i = 0; i < files.length; i++) {
				File filename = files[i];
				System.out.println(filename.toString().substring(3)+ "\\");
			}
		}
		
		System.out.println("\nTotal File Number: " + files2.length);
		

		if (files2.length == 0) {
			System.out.println("No files found in the directory");
		} else {
			for (int i = 0; i < files2.length; i++) {
				File filename = files2[i];
				System.out.println(filename.toString().substring(3));
			}
		}
		
		
	}

}
