package com.oocl.licupca.hw;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Exer10 {
	public static void main(String[] args) {
		try {
			URL url = new URL("file:///C:/Users/licupca/git/ITA-MNL_GROUP2/LICUPCA/18AUG2017/NONJAVA/exer3/index.html");
			ReadableByteChannel channel = Channels.newChannel(url.openStream());
			String fileName = "D://outputexer10.txt";
			FileOutputStream fileOutputStream = new FileOutputStream(fileName);
			fileOutputStream.getChannel().transferFrom(channel, 0, Long.MAX_VALUE);

			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);


			
			Writer writer = new OutputStreamWriter(new FileOutputStream("D:\\outputHTML.txt"), "utf-8");
            while (bufferedReader.readLine()!=null) {
            	writer.write(bufferedReader.readLine());
            	System.out.println(bufferedReader.readLine());
			}
            writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
