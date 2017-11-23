package aadishjoshi.com.RestAPIForLibraryManagementSystem.database;

import java.util.HashMap;
import java.util.Map;

import aadishjoshi.com.RestAPIForLibraryManagementSystem.model.Message;

public class database {

	private static Map<Long, Message> messages = new HashMap<>();
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
}
