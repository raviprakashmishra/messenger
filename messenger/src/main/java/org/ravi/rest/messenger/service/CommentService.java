package org.ravi.rest.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.ravi.rest.messenger.database.Database;
import org.ravi.rest.messenger.model.*;

public class CommentService {
	static Map<Long, Message> messages = Database.messages;
	
	public List<Comment> getAllComments(long messageId){
		 Map<Long, Comment> comments = messages.get(messageId).getComments();
		 return new ArrayList<>(comments.values());
	}
	
	public Comment getComment(long messageId, long commentId){
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		return comments.get(commentId);
	}
	
	public Comment addComment(long messageId, Comment comment){
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		comment.setId(comments.size()+1);
		comments.put(comment.getId(),comment);
		return comment;
		
		
	}
}
