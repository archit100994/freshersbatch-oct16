package oct24;

public class PingpongMain implements Runnable{

	
	Thread t1, t2, t3;
	
	public PingpongMain()
	{
		t1=new Thread(this);
		t2=new Thread(this);
		t3=new Thread(this);
		
		t1.setName("PING");
		t2.setName("PONG");
		t3.setName("TONG");
		
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
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
					Thread.sleep(100);
				} catch (InterruptedException e) {
				// 	TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new PingpongMain();

	}

}
