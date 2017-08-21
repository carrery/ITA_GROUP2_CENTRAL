package com.resource;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.app.FilesFolders;



@Path("/folder/{folder}")
public class FolderResource {
	
	@PathParam("folder") String folder;
	@GET
	@Produces("text/plain")
	public String folder() {
		return new FilesFolders("D:\\" + folder).getResult();
	}
	
}
