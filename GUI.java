package com.game.ttt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI extends JFrame implements ActionListener {

	GameCalcs ttt = new GameCalcs();
	JButton[] buttray = new JButton[9];
	boolean turn = true; //true for X, false for O

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

		if(event.getSource() == buttray[0]) { //upper left
			if(turn) {
				ttt.boardUpdateX(0);
				buttray[0].setText("X");
				turn = false;
			} else if(turn == false) {
				ttt.boardUpdateO(0);
				buttray[0].setText("O");
				turn = true;
			}
		}

		if(event.getSource() == buttray[1]) { //upper middle
			if(turn) {
				ttt.boardUpdateX(1);
				buttray[1].setText("X");
				turn = false;
			} else if(turn == false) {
				ttt.boardUpdateO(1);
				buttray[1].setText("O");
				turn = true;
			}
		}

		if(event.getSource() == buttray[2]) { //upper right
			if(turn) {
				ttt.boardUpdateX(2);
				buttray[2].setText("X");
				turn = false;
			} else if(turn == false) {
				ttt.boardUpdateO(2);
				buttray[2].setText("O");
				turn = true;
			}
		}

		if(event.getSource() == buttray[3]) { //middle left
			if(turn) {
				ttt.boardUpdateX(3);
				buttray[3].setText("X");
				turn = false;
			} else if(turn == false) {
				ttt.boardUpdateO(3);
				buttray[3].setText("O");
				turn = true;
			}
		}

		if(event.getSource() == buttray[4]) { //middle middle
			if(turn) {
				ttt.boardUpdateX(4);
				buttray[4].setText("X");
				turn = false;
			} else if(turn == false) {
				ttt.boardUpdateO(4);
				buttray[4].setText("O");
				turn = true;
			}
		}

		if(event.getSource() == buttray[5]) { //middle right
			if(turn) {
				ttt.boardUpdateX(5);
				buttray[5].setText("X");
				turn = false;
			} else if(turn == false) {
				ttt.boardUpdateO(5);
				buttray[5].setText("O");
				turn = true;
			}
		}

		if(event.getSource() == buttray[6]) { //bottom left
			if(turn) {
				ttt.boardUpdateX(6);
				buttray[6].setText("X");
				turn = false;
			} else if(turn == false) {
				ttt.boardUpdateO(6);
				buttray[6].setText("O");
				turn = true;
			}
		}

		if(event.getSource() == buttray[7]) { //bottom middle
			if(turn) {
				ttt.boardUpdateX(7);
				buttray[7].setText("X");
				turn = false;
			} else if(turn == false) {
				ttt.boardUpdateO(7);
				buttray[7].setText("O");
				turn = true;
			}
		}

		if(event.getSource() == buttray[8]) { //bottom right
			if(turn) {
				ttt.boardUpdateX(8);
				buttray[8].setText("X");
				turn = false;
			} else if(turn == false) {
				ttt.boardUpdateO(8);
				buttray[8].setText("O");
				turn = true;
			}
		}
	}

}
