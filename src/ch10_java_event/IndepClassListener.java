package ch10_java_event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame{
	IndepClassListener(){
		this.setTitle("Action 이벤트 리스너 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mypanel = new JPanel();
		mypanel.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		btn.addActionListener(new Listener());
		mypanel.add(btn);	
		this.setContentPane(mypanel);
		
		this.setVisible(true);
		this.setSize(400,400);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IndepClassListener();
	}

}

class Listener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action")) {
			b.setText("액션");
		}
		else
			b.setText("Action");
	}
}