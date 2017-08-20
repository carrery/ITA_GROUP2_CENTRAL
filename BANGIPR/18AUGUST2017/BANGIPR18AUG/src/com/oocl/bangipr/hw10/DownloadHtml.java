package com.oocl.bangipr.hw10;

import java.io.IOException;

public class DownloadHtml {

//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		URL website = new URL("https://github.com/");
//		ReadableByteChannel rbc = Channels.newChannel(website.openStream());
//		FileOutputStream fos = new FileOutputStream("resources/information.doc");
//		fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
//
//	}
	
	public static void main(String[] args) {
        String fileURL = "https://github.com/";
        String saveDir = "resources/html.docx";
        try {
           DownloadHtmlUtiliy.downloadFile(fileURL, saveDir);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
