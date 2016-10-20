package oct20;

import java.util.Random;

interface monitorBP
{
	public void monitor();
}

public class Hospital
{
	public static void main(String[] args)
	{
		monitorBP mbp= new monitorBP()
		{
			@Override
			public void monitor()
			{
				// TODO Auto-generated method stub
				while(true)
				{
					Random rm= new Random();
					int bp=rm.nextInt(200);
					System.out.println(bp);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(bp>140)
					{
						System.out.println("High BP");
						break;
					}
				}
			}
		};
		
		mbp.monitor();
		
	}

}
