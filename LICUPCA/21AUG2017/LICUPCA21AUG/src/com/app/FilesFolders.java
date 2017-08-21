package com.app;

import java.io.File;
import java.util.ArrayList;

public class FilesFolders {
	private String result;
	public FilesFolders(String path) {
		// TODO Auto-generated method stub
		listFiles(path);
	}
	
    public void listFiles(String directoryName){
    	this.result = "";
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
        
        this.result += "\nTotal folder: " + folders.size();
        for (String folder : folders) {
        	this.result += "\n" +folder +"\\";
        }
        
        this.result += "\nTotal files: " + files.size();
        
        for (String file : files) {
        	this.result += "\n" + file;
        }
        
    }
    
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
