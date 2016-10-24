package oct24;

public class PingpongMainThread extends Thread{

	
	//Thread t1, t2, t3;
	
	public PingpongMainThread()
	{
		start();
	}
	
	@Override
	public void run() {
	
		Thread currentThread= Thread.currentThread();
		
		if(currentThread.getName().equals("PING"))
		{
			for(int i=0; i<10 ; i++)
			{
				System.out.println("PING");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
				// 	TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		else if(currentThread.getName().equals("PONG"))
		{
			for(int i=0; i<10;i++)
			{
				System.out.println("\t\tPONG");
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
				// 	TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		else if(currentThread.getName().equals("TONG"))
		{
				for(;;)
				{
				System.out.println("\t\t\t\tTONG");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				// 	TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new PingpongMainThread().setName("PING");
		new PingpongMainThread().setName("PONG");
		new PingpongMainThread().setName("TONG");

	}

}
