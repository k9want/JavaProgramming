package ch9_swing;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
	setTitle("GridLayout ����");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel c = new JPanel();
	c.setLayout(new GridLayout(4,2));
	c.add(new JLabel("�̸�"));
	c.add(new JTextField("��"));
	c.add(new JLabel("�̸�"));
	c.add(new JTextField("��"));
	c.add(new JLabel("�̸�"));
	c.add(new JTextField("��"));
	c.add(new JLabel("�̸�"));
	c.add(new JTextField("��"));
	
	this.setContentPane(c);
	this.setVisible(true);
	this.setSize(400,400);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridLayoutEx ex = new GridLayoutEx();
	}

}
