package oct24;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class WaterTank extends Frame {

	int y1 = 400, y2 = 400, y3 = 400;
	float capacity=70.00f;
	public WaterTank() {
		super("Ball game");
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	
		Thread inlet, outlet, controller;
		
		inlet = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				capacity += 16.77f;
				
				try {
					Thread.sleep(70);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				repaint();
			}
		});
		
		
		outlet = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				capacity -= 23.34f;
				
				try {
					Thread.sleep(70);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				repaint();
			}
		});
		
		
		inlet.start();
		outlet.start();
		
	}
	public void paint(Graphics g) {
		
		g.drawRect(150, 100, 200, 300);
		g.setColor(Color.RED);
		g.fillRect(150, 400, 200, -(300*(int)(capacity/100)));
		g.drawString("70%", 380, 200);
	}

	public static void main(String[] args) {
		Frame mf = new WaterTank();
		mf.setSize(500, 500);
		mf.setVisible(true);
		
	}
	
}
