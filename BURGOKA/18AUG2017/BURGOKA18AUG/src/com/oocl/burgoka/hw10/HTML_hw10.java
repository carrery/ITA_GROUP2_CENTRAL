package com.oocl.burgoka.hw10;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.Document;
import javax.xml.ws.spi.http.HttpContext;

public class HTML_hw10 {

	public static void main(String[] args) {
		try {
			
		ArrayList<String> str = new ArrayList<String>();	
		URL u = new URL("http://www.bing.com/");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(u.openStream()));

        
        FileWriter out = new FileWriter(("D:/html.txt"), true);
        String inputLine;
        while ((inputLine = in.readLine()) != null) { 
        	out.append(inputLine);
        	out.write(System.getProperty( "line.separator" ));
        	str.add(inputLine);
            //System.out.println(inputLine);
        }
        
        out.flush();
        out.close();
        //FileReader ina = new FileReader("D:\\test.html");
        //Html2Text parser = new Html2Text();
        //parser.parse(ina);
        in.close();
        //System.out.println(parser.getText());
        
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
