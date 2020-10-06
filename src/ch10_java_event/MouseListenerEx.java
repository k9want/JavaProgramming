package ch10_java_event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame{
	JLabel la = new JLabel("Hello");
	
	MouseListenerEx(){
		
		this.setTitle("예제 풀이 내 방식대로 ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mypanel = new JPanel();
		this.setContentPane(mypanel);
		
		mypanel.addMouseListener(new Mymouselistener());
		la.setBounds(30,30,50,20);
		mypanel.add(la);
		
		
		this.setSize(400,400);
		this.setVisible(true);
	}
	
	class Mymouselistener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
			
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerEx();
	}

}
