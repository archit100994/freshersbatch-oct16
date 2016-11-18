package chat;

import java.util.Set;

public class Users {
	String name;
	Set<Messages> msg;
	
	public Users()
	{
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Messages> getMsg() {
		return msg;
	}

	public void setMsg(Set<Messages> msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Users [name=" + name + ", msg=" + msg + "]";
	}
	
	
}
