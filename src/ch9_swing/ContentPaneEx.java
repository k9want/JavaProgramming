package ch9_swing;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		this.setTitle("ContentPane °ú JFrame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		this.setSize(400,300);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}

}
