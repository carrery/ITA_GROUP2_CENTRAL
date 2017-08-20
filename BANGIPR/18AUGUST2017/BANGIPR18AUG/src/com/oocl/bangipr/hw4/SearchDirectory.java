package com.oocl.bangipr.hw4;

import java.io.File;
import java.util.ArrayList;

public class SearchDirectory {
	
	public static void search(String directory){
        File direct = new File(directory);
        File[] fileList = direct.listFiles();
        ArrayList<String> folders = new ArrayList<String>();
        ArrayList<String> files = new ArrayList<String>();
        
        int i =0, e =0;
        
        for (File file : fileList){
            if (file.isFile()){
            	files.add(file.getName());
            } 
            
            if (file.isDirectory()){
                folders.add(file.getName());
            }
        }
        
        
        System.out.println("Number of files: " + files.size());
        for(; i< files.size(); i++) {
        	System.out.println(files.get(i));
        }
        System.out.println("=====================");
        System.out.println("Number of directories: " + folders.size());
        for(; e< folders.size(); e++) {
        	System.out.println(folders.get(e));
        }
        
    }
	

	public static void main(String[] args) {

         String directory ="D://ITA2 Codes/ITA-MNL_GROUP2";
         search(directory);
	}

}
