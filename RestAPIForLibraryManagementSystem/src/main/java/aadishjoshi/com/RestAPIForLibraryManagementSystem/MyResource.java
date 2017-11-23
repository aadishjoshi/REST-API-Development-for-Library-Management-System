package aadishjoshi.com.RestAPIForLibraryManagementSystem;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import aadishjoshi.com.RestAPIForLibraryManagementSystem.model.Message;
import aadishjoshi.com.RestAPIForLibraryManagementSystem.servicepackage.MessageServices;

@Path("/books")
public class MyResource {

	MessageServices messageservice = new MessageServices();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return messageservice.getAllMessages();
	}
	
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Message addMessage(Message message) {
//		return messageservice.addMessage(message);
//	}
//	
//	
//	@PUT
//	@Path("{messageId}")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Message updateMessage(@PathParam("messageId")long messageId, Message message) {
//		message.setId(messageId);
//		return messageservice.updateMessage(message);
//	}
//	
//	@GET
//	@Path("{messageId}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public String test(@PathParam("messageId")long messageId) {
//		return "Got "+ messageId;
//	}
	
}
