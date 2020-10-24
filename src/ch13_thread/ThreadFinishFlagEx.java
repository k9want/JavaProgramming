package ch13_thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RandomThread extends Thread {
	JPanel mp;
	boolean flag = false;

	public void finish() {
		flag = true;
	}

	RandomThread(JPanel mp) {
		this.mp = mp;
	}

	public void run() {
		while (true) {
			int x = ((int) (Math.random() * mp.getWidth()));
			int y = ((int) (Math.random() * mp.getHeight()));
			JLabel la_run = new JLabel("I LOVE YOU");
			la_run.setSize(150, 30);
			la_run.setLocation(x, y);
			mp.add(la_run);
			mp.repaint();
			mp.revalidate();
			try {
				Thread.sleep(300);
				if (flag == true) {
					mp.removeAll();
					la_run = new JLabel("finish");
					la_run.setBounds(100, 100, 150, 30);
					mp.add(la_run);
					mp.repaint();
					return;
				}

			} catch (InterruptedException e) {
				return;
			}

		}
	}
}

public class ThreadFinishFlagEx extends JFrame {
	RandomThread th;

	ThreadFinishFlagEx() {
		this.setTitle("flag로 종료하기 ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel mp = new JPanel();
		this.setContentPane(mp);
		mp.setLayout(null);
		mp.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				th.finish();
			}
		});

		this.setVisible(true);
		this.setSize(400, 300);

		th = new RandomThread(mp);
		th.start();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadFinishFlagEx();
	}

}
