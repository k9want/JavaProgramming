package ch9_swing;


import java.awt.*;
import javax.swing.*;

public class OpenChallenge9 extends JFrame {
	
	public OpenChallenge9() {
		this.setTitle("OpenChallenge_9");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		class NorthPanel extends JPanel {
			public NorthPanel() {
			this.setBackground(Color.gray);
			this.add(new JButton("Open"));
			this.add(new JButton("Read"));
			this.add(new JButton("Close"));
			}
		}
		
		class CenterPanel extends JPanel{
			public CenterPanel() {
				this.setLayout(null);
				JLabel la1 = new JLabel("Hello");
				JLabel la2 = new JLabel("Java");
				JLabel la3 = new JLabel("Love");
				
				int x= (int)(Math.random()*200)+50;
				int y=(int)(Math.random()*200)+50;
				la1.setBounds(x, y, 50, 50);
				la2.setBounds((int)(Math.random()*200),(int)(Math.random()*200),50,50);
				la3.setBounds((int)(Math.random()*200),(int)(Math.random()*200),50,50);
				
				this.add(la1);
				this.add(la3);
				this.add(la2);
			}	
		}
		
		c.add(new NorthPanel(),BorderLayout.NORTH);
		c.add(new CenterPanel(),BorderLayout.CENTER);	
		this.setSize(400,400);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpenChallenge9 ex = new OpenChallenge9();
	}

}
