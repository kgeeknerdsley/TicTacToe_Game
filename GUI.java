package com.game.ttt;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GUI extends JFrame {
	
	JButton tl = new JButton("Top Left");
	JButton tm = new JButton("Top Middle");
	JButton tr = new JButton("Top Right");
		
	JButton ml = new JButton("Left Middle");
	JButton mm = new JButton("Middle");
	JButton mr = new JButton("Right Middle");
		
	JButton bl = new JButton("Bottom Left");
	JButton bm = new JButton("Bottom Middle");
	JButton br = new JButton("Bottom Right");
		
	//do something like bl.addActionListener(whatever) for setting the function

	public GUI() {
		initUI();
	}
		
	private void initUI() {
		JPanel panel = new JPanel();
			
		panel.setBorder(BorderFactory.createEmptyBorder(3,3,5,5));
		panel.setLayout(new GridLayout(3,3,5,5));
			
		String[] buttons = {"Top Left", "Top Middle", "Top Right", "Middle Left", "Middle", "Middle Right", "Bottom Left", "Bottom Middle", "Bottom Right"};
	}
		
	public static void main(String[] args) {
	}	
}
