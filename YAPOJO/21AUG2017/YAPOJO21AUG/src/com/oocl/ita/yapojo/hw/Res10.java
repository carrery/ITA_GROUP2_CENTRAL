package com.oocl.ita.yapojo.hw;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@javax.ws.rs.Path("/res10")
public class Res10 {
	private static final int BUFFER_SIZE = 1024 * 10;
	private static final int ZERO = 0;
	private final byte[] dataBuffer = new byte[BUFFER_SIZE];
	
	@GET
	@Produces("text/plain")
	public String res10() {
		
		try {
			final URL urlObject = new URL("https://stackoverflow.com/questions/5867975/reading-websites-contents-into-string");
			
			final StringBuilder sb = new StringBuilder();

			try {
				final BufferedInputStream in = new BufferedInputStream(urlObject.openStream());

				int bytesRead = ZERO;

				while ((bytesRead = in.read(dataBuffer, ZERO, BUFFER_SIZE)) >= ZERO) {
					sb.append(new String(dataBuffer, ZERO, bytesRead));
				}
			} catch (UnknownHostException e) {
				return null;
			} catch (IOException e) {
				return null;
			}
			
			String contents = sb.toString();

			if (contents != null) {
				
				byte data[] = contents.getBytes();
				java.nio.file.Path path = Paths.get("C:\\Users\\yapojo\\Desktop\\Test\\Assignment10.txt");

				try (OutputStream output = new BufferedOutputStream(Files.newOutputStream(path, CREATE, APPEND))) {
				  output.write(data, 0, data.length);
				} catch (IOException x) {
				  System.err.println(x);
				}
				
				return "Content already downloaded.."; 
			} else {
				return "Error!";
			}
		} catch (MalformedURLException e) {
			return "Check you the url!";
		}
	}
}
