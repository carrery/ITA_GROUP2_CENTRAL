package com.oocl.licupca.hw;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Exer10 {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.wikipedia.org");
			ReadableByteChannel channel = Channels.newChannel(url.openStream());
			String fileName = "D://outputexer10.txt";
			FileOutputStream fileOutputStream = new FileOutputStream(fileName);
			fileOutputStream.getChannel().transferFrom(channel, 0, Long.MAX_VALUE);

			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.readLine() != null) {
				System.out.println(bufferedReader.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
