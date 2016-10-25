package oct25;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class PingpongExecutor implements Runnable
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Runnable r1= new Runnable()
		{
			@Override
			public void run() 
			{
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
				
			}
		};
		
		Runnable r2= new Runnable()
		{
			@Override
			public void run() 
			{
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
				
			}
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(r1);
		executor.submit(r2);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
