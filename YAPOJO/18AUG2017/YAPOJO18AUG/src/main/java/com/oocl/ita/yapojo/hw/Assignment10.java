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
import java.nio.file.Path;
import java.nio.file.Paths;

public class Assignment10 {
	private static final int BUFFER_SIZE = 1024 * 10;
	private static final int ZERO = 0;
	private final byte[] dataBuffer = new byte[BUFFER_SIZE];
	private final URL urlObject;

	public Assignment10(String urlString) throws MalformedURLException {
		this.urlObject = new URL(urlString);
	}

	public String read() {
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

		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Assignment10 url = new Assignment10("https://stackoverflow.com/questions/5867975/reading-websites-contents-into-string");
			String contents = url.read();

			if (contents != null) {
				System.out.println(contents);
			    byte data[] = contents.getBytes();
			    Path path = Paths.get("C:\\Users\\yapojo\\Desktop\\Test\\Assignment10.txt");

			    try (OutputStream output = new BufferedOutputStream(Files.newOutputStream(path, CREATE, APPEND))) {
			      output.write(data, 0, data.length);
			    } catch (IOException x) {
			      System.err.println(x);
			    }
			} else {
				System.out.println("Error!");
			}
		} catch (MalformedURLException e) {
			System.out.println("Check the url!");
		}

	}

}
