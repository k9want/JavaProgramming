package ch10_java_event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.event.*;

public class Ch10_p582_02 extends JFrame {
	public Ch10_p582_02(){
		
		this.setTitle("����2��");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel m = new JPanel();	
		//�Ϻη� �͸� �̺�Ʈ �����ʷ� �ۼ��ߴ�. �ͼ������� ���ؼ� 
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
