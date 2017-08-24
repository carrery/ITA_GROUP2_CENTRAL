package com.oocl.bangipr.hw2;


import java.io.File;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
 
@Path("/searchFile")
public class MyResource {
	
	@GET
	@Produces("text/html")
	public String files() {
		
		
		  String directory ="D://";
	         //search(directory);
	         
	         return "hannah";//search(directory);
		
	}
	
	public static  String search(String directory){
        File direct = new File(directory);
        File[] fileList = direct.listFiles();
        ArrayList<String> folders = new ArrayList<String>();
        ArrayList<String> files = new ArrayList<String>();
        
        String retu="";
        String retu2="";
        
        int i =0, e =0;
        
        for (File file : fileList){
            if (file.isFile()){
            	files.add(file.getName());
            } 
            
            if (file.isDirectory()){
                folders.add(file.getName());
            }
        }
        
     
        for(; i< files.size(); i++) {

        	retu2 += " " + files.get(e) + "<br>";
        }
   
        for(; e< folders.size(); e++) {
        	
        	retu += " " +folders.get(e) + "<br>";
        	
        }

        return "<html><head><title>Homework 2</title> <h1>Get Files and Directories</h1></head>"
	    		+ "<body><h2>Directory is "+directory +"</br></br></h2><h2>The files are : </h2> </br><p>"+ retu2 + 
	    		"</p></br><p>The total number of files are: "+files.size()+
	    		"</p></br></br><h2>The folders are : </h2> </br><p>"+retu+"</p></br><p>The total number of files are:" +folders.size()+"</body></html>";
    }
	

}
