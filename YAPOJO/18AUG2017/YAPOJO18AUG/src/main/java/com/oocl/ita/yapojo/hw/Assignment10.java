package com.oocl.ita.yapojo.hw;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

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
			} else {
				System.out.println("Error!");
			}
		} catch (MalformedURLException e) {
			System.out.println("Check you the url!");
		}

	}

}
