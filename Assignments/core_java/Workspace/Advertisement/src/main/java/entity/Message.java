package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Message")
public class Message
{
	@Id
	@GeneratedValue
	@Column(name="id")
		private int id;
	
	@Column(name="message")
		private	String message;
	
	@Column(name="postId")
		private int postId;
	
	public Message() 
	{
		
	}

	public Message(int id, String message, int postId)
	{
		this.id=id;
		this.message = message;
		this.postId = postId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + ", postId=" + postId + "]";
	}
	
}
