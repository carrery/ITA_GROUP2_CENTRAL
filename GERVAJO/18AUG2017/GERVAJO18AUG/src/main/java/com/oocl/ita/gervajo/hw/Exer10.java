package com.oocl.ita.gervajo.hw;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Exer10 {
	public static void main(String[] args) throws MalformedURLException, IOException {

		URL website = new URL("http://download848.mediafireuserdownload.com/ue98fp13fn3g/etadsx89d9m59gv/luh.txt");
		ReadableByteChannel rbc = Channels.newChannel(website.openStream());
		String filename = "D://test.txt";
		FileOutputStream fos = new FileOutputStream(filename);
		fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		
		do {
			System.out.println(br.readLine());
		}
		while(br.readLine() != null);
			
		
	}

}
