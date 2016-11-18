package Spring.SpringCore.lifeCycle;

import org.springframework.beans.factory.BeanNameAware;

public class Message implements BeanNameAware {

	String msg;
	
	public Message()
	{
		
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("Message: " + msg);
	}

	@Override
	public String toString() {
		return "Message [msg=" + msg + "]";
	}

	public void setBeanName(String beanName) {
		
		System.out.println("Bean name is: " + beanName);
	}
	
	
}
