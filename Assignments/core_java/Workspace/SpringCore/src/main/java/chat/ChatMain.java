package chat;

import java.util.Map;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChatMain {

	public static void main(String[] args) {

		AbstractApplicationContext IoCContainer = new ClassPathXmlApplicationContext("chat.xml");
		Map <String, ChatRoom> map= IoCContainer.getBeansOfType(ChatRoom.class, false, true);
		
		for(int i=0; i<map.size(); i++)
    	{
    		int k=i+1;
    		ChatRoom c1 = (ChatRoom) map.get("chat" + k);
    		Set<Users> u1 = c1.getUser();
    		for(Users u : u1) {
    			Set<Messages> msg = u.getMsg();
    			for(Messages m : msg) {
    				System.out.println(m);
    			}
    		}
    		//sum=sum+o1 
    		
    	}
    	//System.out.println(sum);
	}

}
