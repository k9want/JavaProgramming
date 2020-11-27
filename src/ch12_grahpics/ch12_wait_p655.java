package ch12_grahpics;

import java.awt.*;
import javax.swing.*;

public class ch12_wait_p655 extends JFrame {
	Jla la2 = new Jla();

	private ch12_wait_p655() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Jpanel에서 paintComponent() 사용해보기");
		JPanel mp = new JPanel();
		this.setContentPane(mp);
		mp.add(la2);
		//this.setContentPane(la2);

		this.setSize(400, 300);
		this.setVisible(true);

	}

	class Jla extends JLabel {

		ImageIcon icon = new ImageIcon("images/cafe_map.png");
		Image img = icon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 20, 20, this);
			super.getParent().repaint();

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch12_wait_p655();
	}

}
