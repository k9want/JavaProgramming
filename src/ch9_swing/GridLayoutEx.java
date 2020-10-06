package ch9_swing;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
	setTitle("GridLayout 예제");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel c = new JPanel();
	c.setLayout(new GridLayout(4,2));
	c.add(new JLabel("이름"));
	c.add(new JTextField("가"));
	c.add(new JLabel("이름"));
	c.add(new JTextField("나"));
	c.add(new JLabel("이름"));
	c.add(new JTextField("다"));
	c.add(new JLabel("이름"));
	c.add(new JTextField("라"));
	
	this.setContentPane(c);
	this.setVisible(true);
	this.setSize(400,400);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridLayoutEx ex = new GridLayoutEx();
	}

}
