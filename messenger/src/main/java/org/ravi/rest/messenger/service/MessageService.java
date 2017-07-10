package org.ravi.rest.messenger.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.ravi.rest.messenger.database.Database;
import org.ravi.rest.messenger.model.Message;

public class MessageService {
	
	Map<Long, Message> messages = Database.messages;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar cal = Calendar.getInstance();
	
	public MessageService() {
		// TODO Auto-generated constructor stub
		messages.put(1L,new Message("1Msg","ravi",1L));
		messages.put(2L,new Message("2Msg","ravi",2L));
	}
	
	
	public List<Message> geAlltMessages() {
		return new ArrayList<>(messages.values());
	}
	public List<Message> getAllMessagesForTheYear(int year){
		List<Message> list = new ArrayList<>();
		Calendar cal =  Calendar.getInstance();
		for(Message msg:messages.values()){
			cal.setTime(msg.getCreated());;
			if(cal.get(Calendar.YEAR) == year)
				list.add(msg);
		}
		
		return list;
	}
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		if (message == null) return null;
		messages.put(messages.size()+1l,message);
		return message;		
		
	}
	
	public Message updateMessage(Message message){
		if (message == null) return null;
		
		messages.put(message.getId(), message);
		return message;
	}
	
	public void removeMessage(long id){
		messages.remove(id);
		
	}
	
	
	/*public List<Message> getAllMessages(){
		Message m1 = new Message("Hello world1", "ravi", 1L, new Date());
		Message m2 = new Message("Hello world123", "ravi", 2L, new Date());
		 List<Message> list = new ArrayList<>();
		 list.add(m1);
		 list.add(m2);
		return list;
	}*/

}
