package org.ravi.rest.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class CommentResource {
	@GET
	public String get(){
		return "new sub resource test";
	}
	
	@GET
	@Path("/{commentId}")
	public  String getComment(@PathParam("messageId") long messageId,@PathParam("commentId") long commentId){
		return "messageId "+messageId+" commentId "+commentId;
	}
}
