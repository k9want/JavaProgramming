package ch10_java_event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.event.*;

public class Ch10_p582_02 extends JFrame {
	public Ch10_p582_02(){
		
		this.setTitle("문제2번");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel m = new JPanel();	
		//일부러 익명 이벤트 리스너로 작성했다. 익숙해지기 위해서 
		m.addMouseMotionListener(new MouseAdapter(){
			public void mouseDragged(MouseEvent e) {
				m.setOpaque(true);
				m.setBackground(Color.yellow);
			}
			
		});
		m.addMouseListener(new MouseAdapter(){
			public void mouseReleased(MouseEvent e) {
				m.setOpaque(true);
				m.setBackground(Color.green);
			}
			
		});
		
		m.setOpaque(true);
		m.setBackground(Color.green);
		this.setContentPane(m);
		this.setVisible(true);
		this.setSize(400,400);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ch10_p582_02();
	}

}
