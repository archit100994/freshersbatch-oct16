package Spring.SpringCore;

import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext IoCContainer = new ClassPathXmlApplicationContext("Beans_App.xml");
    	Map<String, Order> map=IoCContainer.getBeansOfType(Order.class, false, true);
    	int sum=0;
    	for(int i=0; i<map.size(); i++)
    	{
    		int k=i+1;
    		//Order o1 = map.get("order" + k);
    		//sum=sum+o1 
    		sum=sum+map.get("order" + k).getItem().getPrice();
    	}
    	System.out.println(sum);
    }
}
