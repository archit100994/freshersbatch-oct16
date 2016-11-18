package chat;

import java.util.Set;

public class ChatRoom 
{
	String name;
	Set<Users> user;
	
	public ChatRoom()
	{
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Users> getUser() {
		return user;
	}

	public void setUser(Set<Users> user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "ChatRoom [name=" + name + ", user=" + user + "]";
	}
	
	
}
