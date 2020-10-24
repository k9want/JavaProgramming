package ch13_thread;

import java.awt.*;
import java.awt.event.*;

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
	Thread th ;
	RunnableTimerEx() {
		this.setTitle("타이머");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel mp = new JPanel();
		mp.setLayout(new FlowLayout());

		JLabel la = new JLabel("타이머");
		la.setFont(new Font("바탕", Font.BOLD, 26));

		this.setContentPane(mp);
		mp.add(la);
		JButton btn = new JButton("종료");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e ) {
				th.interrupt();
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false);
				
			}
		});
		JButton start= new JButton("시작");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				th.start();
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false);
			}
		});
		
		mp.add(start);
		mp.add(btn);


		TimerRunnable runnable = new TimerRunnable(la);
		th = new Thread(runnable);

		this.setSize(400, 300);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RunnableTimerEx();
	}

}
