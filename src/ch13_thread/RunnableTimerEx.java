package ch13_thread;

import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable {
	JLabel la;

	TimerRunnable(JLabel la) {
		this.la = la;
	}

	public void run() {
		int n = 0;
		while (true) {
			la.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}

		}
	}
}

public class RunnableTimerEx extends JFrame {
	RunnableTimerEx() {
		this.setTitle("≈∏¿Ã∏”");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel mp = new JPanel();
		mp.setLayout(new FlowLayout());

		JLabel la = new JLabel();
		la.setFont(new Font("πŸ≈¡", Font.BOLD, 26));

		this.setContentPane(mp);
		mp.add(la);

		TimerRunnable runnable = new TimerRunnable(la);
		Thread th = new Thread(runnable);

		this.setSize(400, 300);
		this.setVisible(true);

		th.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RunnableTimerEx();
	}

}
