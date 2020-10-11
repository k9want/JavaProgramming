package ch10_java_event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Ch10_p582_04 extends JFrame {
	String text = new String("Love Java");
	JLabel la;
	JPanel jp = new JPanel();
	
	public Ch10_p582_04(){
		this.setTitle("¹®Á¦ 4¹ø");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,400);
		this.setContentPane(jp);

		jp.setLayout(new FlowLayout());
		
		la=new JLabel(text);
		la.addKeyListener(new MyKeyListener());

		jp.add(la);
	
		this.setVisible(true);
		la.setFocusable(true);
		la.requestFocus();	
	}
	class MyKeyListener extends KeyAdapter{
		@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					text=text.substring(1)+text.substring(0,1);
					la.setText(text);
				}
			}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ch10_p582_04();
	}

}
