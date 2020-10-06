
package ch10_java_event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame{
	AnonymousClassListener(){
		this.setTitle("Action 이벤트 리스너 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mypanel = new JPanel();
		mypanel.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action")) {
					b.setText("액션");
					mypanel.setBackground(Color.cyan);
				}
				else {
					b.setText("Action");
				mypanel.setBackground(Color.pink);
				}
				setTitle(b.getText());
				
			}
		});
		mypanel.add(btn);	
		this.setContentPane(mypanel);
		
		this.setVisible(true);
		this.setSize(400,400);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnonymousClassListener();
	}

}
