package com.oocl.ita.yapojo.hw;

import java.io.File;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directories ="Total directory number: ";
		String dirNames = "\n";
		Integer dirNum = 0;
		String files ="Total file number: ";
		String fileNames ="\n";
		Integer fileNum = 0;
		
		File directory = new File("C:\\Users\\yapojo\\Desktop\\DragAndDrop");
		
		for(File file : directory.listFiles()) {
			if(file.isFile() && !file.isHidden()) {
				fileNum +=1;
				fileNames += file.getName() + "\n";
			} else if(file.isDirectory()  && !file.isHidden()) {
				dirNum +=1;
				dirNames += file.getName() + "\n";
			}
		}
		
		System.out.println(directories + dirNum +  dirNames);
		System.out.println(files + fileNum +  fileNames);
		
	}

}
