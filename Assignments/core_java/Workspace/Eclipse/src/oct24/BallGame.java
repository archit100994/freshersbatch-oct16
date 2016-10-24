package oct24;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class BallGame extends Frame implements Runnable{

		
		int y1 = 400, y2 = 400, y3 = 400;
		
		public BallGame() {
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
							Thread.sleep(250);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
							
							repaint();
					}
					while(y1<=450 && y1>50)
						{
							y1=y1-increment;
							try {
								Thread.sleep(250);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
								repaint();
						}
					

					
					try {
						Thread.sleep(250);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
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
								Thread.sleep(250);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
								
								repaint();
						}
						while(y2<=450 && y2>50)
							{
								y2=y2-increment;
								try {
									Thread.sleep(250);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
									repaint();
							}
						

						
						try {
							Thread.sleep(250);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
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
								Thread.sleep(250);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
								
								repaint();
						}
						while(y3<=450 && y3>50)
							{
								y3=y3-increment;
								try {
									Thread.sleep(250);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
									repaint();
							}
						

						
						try {
							Thread.sleep(250);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					
								
				}});
			
			
			
			t1.start();
			t2.start();
			t3.start();
						
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
		Frame mf = new BallGame();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	

}
