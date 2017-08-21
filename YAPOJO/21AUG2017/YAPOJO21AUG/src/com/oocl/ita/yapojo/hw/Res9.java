package com.oocl.ita.yapojo.hw;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/res9")
public class Res9 {
	@GET
	@Produces("text/plain")
	public String res9() {
		Runtime run = Runtime.getRuntime();

		try {
			run.exec("notepad");
			run.exec("C:\\Program Files (x86)\\Windows Media Player\\wmplayer.exe");
		} catch (IOException e) {
			System.out.println(e);
		} 
		
		return "Notepad and Windows Media Player started...";
	}
}
