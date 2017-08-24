package com.resource;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hw2")
public class HwResource2 {
	// @PathParam("word")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String hw() throws IOException {
		String html = null;
		//URL website = new URL("http://www.mkyong.com/java/how-to-convert-file-into-an-array-of-bytes/");
		URL website = new URL("http://www.bing.com/");
		ReadableByteChannel rbc = Channels.newChannel(website.openStream());
		String filename = "D://test.txt";
		FileOutputStream fos = new FileOutputStream(filename);
		fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);

		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		
		for (String line : Files.readAllLines(Paths.get(filename))) {
			html += line;
		}

		return html;

	}
}
