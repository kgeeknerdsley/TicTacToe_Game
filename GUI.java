package com.game.ttt;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GUI extends JFrame implements ActionListener {
	
	GameCalcs ttt = new GameCalcs();
	JButton[] buttray = new JButton[9];

	public GUI() {
		initUI();
	}
		
	private void initUI() {
		JFrame mwindow = new JFrame();
		
		//buttons
		JPanel panel = new JPanel();
			
		panel.setBorder(BorderFactory.createEmptyBorder(3,3,5,5));
		panel.setLayout(new GridLayout(3,3,10,10));
			
		String[] buttons = {"Top Left", "Top Middle", "Top Right", "Middle Left", "Middle", "Middle Right", "Bottom Left", "Bottom Middle", "Bottom Right"};
		
		for(int i = 0; i < buttons.length; i++) {
			buttray[i] = new JButton(buttons[i]);
			panel.add(buttray[i]);
			buttray[i].addActionListener(this);
		}
		
		add(panel);
		
		/*
		 * THIS PART IS CURRENTLY BROKEN 
		displays state of game board
		JLabel boardDisplayer = new JLabel(ttt.boardDisplay());
		mwindow.getContentPane().add(BorderLayout.EAST, boardDisplayer);
		*/
		
		//master window setup
		mwindow.setTitle("Tic Tac Toe Simulator 2k15");
		mwindow.setSize(500,500);
		mwindow.setLocationRelativeTo(null);
		mwindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GUI gui = new GUI();
				gui.setVisible(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println(event.getActionCommand());
		System.out.println(event.paramString());
		
		if(event.getSource() == buttray[5]) { //tests for middle right, as example
		}
	}	
}
