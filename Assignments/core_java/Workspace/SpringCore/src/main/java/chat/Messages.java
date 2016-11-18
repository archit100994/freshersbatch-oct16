package chat;

public class Messages {
	String msgs;
	
	public Messages()
	{
		
	}

	public String getMsgs() {
		return msgs;
	}

	public void setMsgs(String msgs) {
		this.msgs = msgs;
	}

	@Override
	public String toString() {
		return "Messages [msgs=" + msgs + "]";
	}
	
}
