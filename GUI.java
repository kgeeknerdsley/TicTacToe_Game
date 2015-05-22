package com.game.ttt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI extends JFrame implements ActionListener {
	
	GameCalcs ttt = new GameCalcs();
	JButton[] buttray = new JButton[9];

	public GUI() {
		initGridUI();
	}
		
	private void initGridUI() {
		
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
				
		//master window setup
		setTitle("Tic Tac Toe Simulator 2k15: The Buttons");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GUI gui = new GUI();
				gui.setVisible(true);
				GUIDisplay statgui = new GUIDisplay();
				statgui.setVisible(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println(event.getActionCommand());
		System.out.println(event.paramString());
		
		if(event.getSource() == buttray[5]) { //tests for middle right, as example
			ttt.boardUpdateX(5);
		}
	}

}
