package aadishjoshi.com.RestAPIForLibraryManagementSystem.model;


import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private long id;
	private String BookName;
	private String author;
	private Date CheckInDate;
	
	public Message() {
		
	}
	
	public Message(long id,String BookName, String author) {
		this.id = id;
		this.BookName = BookName;
		this.author = author;
		this.CheckInDate = new Date();
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCheckInDate() {
		return CheckInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		CheckInDate = checkInDate;
	}
	
}
