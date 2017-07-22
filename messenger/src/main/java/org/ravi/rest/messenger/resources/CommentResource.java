package org.ravi.rest.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ravi.rest.messenger.model.Comment;
import org.ravi.rest.messenger.service.CommentService;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CommentResource {
	CommentService service = new CommentService();
	@GET
	public List<Comment> getAllComment(@PathParam("messageId") long messageId){
		return service.getAllComments(messageId);
	}
	
	@POST
	public Comment addComments(@PathParam("messageId") long messageId, Comment comment){
		return service.addComment(messageId, comment);
	}
}
