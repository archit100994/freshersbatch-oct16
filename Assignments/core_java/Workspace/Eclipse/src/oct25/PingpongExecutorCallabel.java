package oct25;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PingpongExecutorCallabel implements Callable<String>
{
	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		// TODO Auto-generated method stub
		Callable r1= new Callable()
		{
			@Override
			public Object call() throws Exception {
				// TODO Auto-generated method stub
				for(int i=0; i<10 ; i++)
				{
					System.out.println("PING");
					try 
					{
						Thread.sleep(300);
					} 
					catch (InterruptedException e) 
					{
					// 	TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				return null;
			}
		};
		
		Callable r2= new Callable()
		{
			@Override
			public Object call() throws Exception {
				// TODO Auto-generated method stub
				
				for(int i=0; i<10 ; i++)
				{
					System.out.println("\t\tPONG");
					try 
					{
						Thread.sleep(400);
					} 
					catch (InterruptedException e) 
					{
					// 	TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				return null;
			}
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Future<String> future= (Future<String>) executor.submit(r1);
		Future<String> future1= (Future<String>) executor.submit(r2);
		
		future.get();
//		executor.submit(r1);
//		executor.submit(r2);
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
