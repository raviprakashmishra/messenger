package org.ravi.rest.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.ravi.rest.messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		Message m1 = new Message("Hello world1", "ravi", 1L, new Date());
		Message m2 = new Message("Hello world123", "ravi", 2L, new Date());
		 List<Message> list = new ArrayList<>();
		 list.add(m1);
		 list.add(m2);
		return null;
	}

}
