package spring.springAOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecutionTime {

	static List<Integer> list = new ArrayList<Integer>();
	static Vector<Integer> vector = new Vector<Integer>();
	
	public static void main(String[] args) 
	{
		
		AbstractApplicationContext ioc = new ClassPathXmlApplicationContext("exectime.xml");
		ExecutionTime a = (ExecutionTime) ioc.getBean("execBean");
		a.add_in_list();
		a.add_in_vector();
		ioc.registerShutdownHook();

	}
	
	public void add_in_vector() {
		
		for(int i=0; i<1000; i++)
		{
			vector.add(i);
		}
		
	}
	public void add_in_list() {
		for(int i=0; i<1000; i++)
		{
			list.add(i);
		}
	}

}
