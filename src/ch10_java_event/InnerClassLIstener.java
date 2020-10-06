package ch10_java_event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InnerClassLIstener extends JFrame{
	InnerClassLIstener(){
		this.setTitle("Action �̺�Ʈ ������ ����");
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
	
	private class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action")) {
				b.setText("�׼�");
			}
			else
				b.setText("Action");
			
			InnerClassLIstener.this.setTitle(b.getText()); //���ٰ��� InnerClassLIstener�� ����� ���� ����!!!
		}
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClassLIstener();
	}

}
