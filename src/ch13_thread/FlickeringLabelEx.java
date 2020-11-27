package ch13_thread;

import java.awt.Color;
import java.awt.Component;

import javax.swing.*;

class FlickeringLabel extends JLabel implements Runnable {

	private int delay;

	public FlickeringLabel(String text, int delay) {
		super(text);
		this.delay = delay;
		this.setOpaque(true);
		Thread th = new Thread(this);
		th.start();
	}

	public void run() {

		int n = 0;
		while (true) {
			if (n == 0) {
				this.setBackground(Color.gray);
				n = 1;
			} else if (n == 1) {
				this.setBackground(Color.blue);
				n = 2;
			} else {
				this.setBackground(Color.cyan);
				n = 0;
			}
			try {
				Thread.sleep(delay);
			}

			catch (InterruptedException e) {
				return;
			}
		}
	}

}



public class FlickeringLabelEx extends JFrame {




	public FlickeringLabelEx() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		this.setContentPane(panel);

		FlickeringLabel fla1 = new FlickeringLabel("±ôºý", 500);

		JLabel la2 = new JLabel("¾È±ôºý");

		FlickeringLabel fla2 = new FlickeringLabel("±ôºý", 300);


		
		
		panel.add(fla1);
		panel.add(la2);
		panel.add(fla2);
		
		
		JLabel timerlabel = new JLabel();
		panel.add(timerlabel);
		
		
		
	

		this.setSize(400, 300);
		this.setVisible(true);
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlickeringLabelEx();
	}

}
