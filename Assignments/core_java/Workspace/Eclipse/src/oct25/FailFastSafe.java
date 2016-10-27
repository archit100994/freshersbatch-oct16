package oct25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastSafe extends Thread {
	
	
	//static List<Integer> lst= new Vector<>();
	//static List<Integer> lst= new ArrayList<Integer>();
	//static Set lst= new HashSet();
	//static Map<Integer> lst= new ConcurrentHashMap();
	static List<Integer> lst= new CopyOnWriteArrayList<Integer>();
	public FailFastSafe()
	{
		start();
	}
	
	public void print() throws InterruptedException
	{
		Iterator<Integer> itr= lst.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			Thread.sleep(500);
		}

	}
	
	public void addl(int i) throws InterruptedException 
	{
		lst.add(i);
		Thread.sleep(1);
		print();
	}
	
	public void run() {
		
		Thread currentThread= Thread.currentThread();
		
		if(currentThread.getName().equals("PING"))
		{
			try {
				print();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		else if(currentThread.getName().equals("PONG"))
		{
			try {
				addl(88);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Integer> lst= new Vector<>();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		
		new FailFastSafe().setName("PING");
		new FailFastSafe().setName("PONG");

	}

}
