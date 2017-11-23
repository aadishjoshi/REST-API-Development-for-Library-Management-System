package aadishjoshi.com.RestAPIForLibraryManagementSystem.servicepackage;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import aadishjoshi.com.RestAPIForLibraryManagementSystem.database.database;
import aadishjoshi.com.RestAPIForLibraryManagementSystem.model.Message;


public class MessageServices {

	private Map<Long, Message> messages = database.getMessages();
	
	public MessageServices() {
		messages.put(1L, new Message(1, "Game of Thrones", "George R. R. Martin"));
		messages.put(2L, new Message(2, "Harry Potter", "J. K. Rowling"));
		messages.put(3L, new Message(3, "The Da Vinci Code", "Dan Brown"));
	}
	
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values()); 
	}
	
	public Message getMessage(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
	
}
