package com.oocl.licupca.hw;

import java.io.File;
import java.util.ArrayList;

public class Exer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listFiles("D:\\ITA_Caloi");
	}
	
    public static void listFiles(String directoryName){
        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        ArrayList<String> files = new ArrayList<>();
        ArrayList<String> folders = new ArrayList<>();
        for (File file : fList){
            if (file.isFile()){
                files.add(file.getName());
            }
            else if (file.isDirectory()){
            	folders.add(file.getName());
            }
        }
        
        System.out.println("\nTotal folder: " + folders.size());
        for (String folder : folders) {
        	System.out.println(folder +"\\");
        }
        
        System.out.println("Total files: " + files.size());
        
        for (String file : files) {
        	System.out.println(file);
        }
        
    }
}
