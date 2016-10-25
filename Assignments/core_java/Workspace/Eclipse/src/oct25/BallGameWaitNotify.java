package oct25;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class BallGameWaitNotify extends Frame
{
	int y1 = 400, y2 = 400, y3 = 400;

	public BallGameWaitNotify()
	{
		super("Ball game");
			setBackground(Color.CYAN);
			setSize(500, 500);
			setVisible(true);
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			
			
		Thread t1= new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				int increment=5;
				while(true)
				{
					while(y1>=50 && y1<450)
					{
						y1=y1+increment;
						try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
							
							repaint();
							
							if(y1==450)
							{
								try {
									check();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
					}
					while(y1<=450 && y1>50)
						{
							y1=y1-increment;
							try {
								Thread.sleep(50);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
								repaint();
								
								if(y1==50)
								{
									try {
										check();
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
						}
				}
							
			}});
			
			
		
		
		Thread t2= new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					int increment=5;
					while(true)
					{
						while(y2>=50 && y2<450)
						{
							y2=y2+increment;
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
								
								repaint();
								if(y2==450)
								{
									try {
										check();
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								
						}
						while(y2<=450 && y2>50)
							{
								y2=y2-increment;
								try {
									Thread.sleep(100);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
									repaint();
									
									if(y2==50)
									{
										try {
											check();
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
							}
				}								
				}});
			
			
			Thread t3= new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					int increment=5;
					while(true)
					{
						while(y3>=50 && y3<450)
						{
							y3=y3+increment;
							try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
								
								repaint();
								
								if(y3==450)
								{
									try {
										check();
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
						}
						while(y3<=450 && y3>50)
							{
								y3=y3-increment;
								try {
									Thread.sleep(200);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
									repaint();
									
									if(y3==50)
									{
										try {
											check();
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
							}
				}
			}});
			
			t1.setName("PING");
			t2.setName("PONG");
			t3.setName("TONG");
			
			t1.start();
			t2.start();
			t3.start();
		}
	
	
	synchronized public void check() throws InterruptedException
	{
		if(Thread.currentThread().getName().equals("PING"))
		{
			wait();
		}
		else if(Thread.currentThread().getName().equals("PONG"))
		{
			wait();
		}
		else if(Thread.currentThread().getName().equals("TONG"))
		{
			notifyAll();
		}
	}
		
		public void paint(Graphics g) {
			g.setColor(Color.RED);
			g.fillOval(100, y1, 50, 50);
			g.setColor(Color.GREEN);
			g.fillOval(200, y2, 50, 50);
			g.setColor(Color.BLUE);
			g.fillOval(300, y3, 50, 50);
		}
		
		public static void main(String[] args) {
		Frame mf = new BallGameWaitNotify();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}

}
