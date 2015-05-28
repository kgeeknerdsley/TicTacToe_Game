package com.game.ttt;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;
import java.util.Timer;

public class GUI extends JFrame implements ActionListener {

	//instances of other classes in proj
	GameCalcs ttt = new GameCalcs();
	AIBrain ai = new AIBrain();

	JButton[] buttray = new JButton[9];
	boolean turn = true; //true for X, false for O
	boolean aiFlag = false;
	private JLabel statusbar;
	Timer timer = new Timer();

	public GUI() {
		initGridUI();
		initMenuUI();
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
		setTitle("Tic Tac Toe Simulator 2k15");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//Little message bar!
		statusbar = new JLabel("Welcome to Tic Tac Toe Simulator 2015! Currently in a 2 Player Game.");
        statusbar.setBorder(BorderFactory.createEtchedBorder());
        add(statusbar, BorderLayout.SOUTH);
        statusbar.setVisible(true);
	}

	private void initMenuUI() {
		JMenuBar menu = new JMenuBar();
		//Do this last, with saved file loc
		//ImageIcon icon = new ImageIcon();

		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);

		JMenu settings = new JMenu("Settings");
		settings.setMnemonic(KeyEvent.VK_S);

		JMenuItem hItem = new JMenuItem("Help");
		hItem.setMnemonic(KeyEvent.VK_H);
		hItem.setToolTipText("Provides author information and game instructions");

		//JMenuItem aiSets = new JMenuItem("AI Settings");
		//aiSets.setMnemonic(KeyEvent.VK_A);
		//aiSets.setToolTipText("Allows customization of AI from random to actually competent");

		JMenuItem eItem = new JMenuItem("Exit"); //add icon as second parameter later
		eItem.setMnemonic(KeyEvent.VK_E);
		eItem.setToolTipText("Exit game");
		eItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});

		//AI toggle switch
		JCheckBoxMenuItem aiToggle = new JCheckBoxMenuItem("Toggle AI");
		aiToggle.setDisplayedMnemonicIndex(5); //what do?
		aiToggle.setSelected(false);

		aiToggle.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					statusbar.setText(ai.introSpeak());
					aiFlag = true;
				} else {
					statusbar.setText("2 Player game is active.");
				}
			}
		});

		file.add(eItem);
		settings.add(aiToggle);

		menu.add(file);
		menu.add(settings);
		menu.add(hItem);


		setJMenuBar(menu);
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
		//System.out.println(event.getActionCommand());
		//System.out.println(event.paramString());

		if(event.getSource() == buttray[0]) { //upper left
			if(turn) {
				ttt.boardUpdateX(0);
				buttray[0].setText("X");
				turn = false;
				
				if(aiFlag) {
					statusbar.setText(ai.moveSpeak()); //makes the ai taunt/speak
				}
			} else if(turn == false) {
				if(aiFlag) {
					//call the ai board update command
				}
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
				
				if(aiFlag) {
					statusbar.setText(ai.moveSpeak()); //makes the ai taunt/speak
				}
			} else if(turn == false) {
				if(aiFlag) {
					//call the ai board update command
				}
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
				
				if(aiFlag) {
					statusbar.setText(ai.moveSpeak()); //makes the ai taunt/speak
				}
			} else if(turn == false) {
				if(aiFlag) {
					//call the ai board update command
				}
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
				
				if(aiFlag) {
					statusbar.setText(ai.moveSpeak()); //makes the ai taunt/speak
				}
			} else if(turn == false) {
				if(aiFlag) {
					//call the ai board update command
				}
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
				
				if(aiFlag) {
					statusbar.setText(ai.moveSpeak()); //makes the ai taunt/speak
				}
			} else if(turn == false) {
				if(aiFlag) {
					//call the ai board update command
				}
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
				
				if(aiFlag) {
					statusbar.setText(ai.moveSpeak()); //makes the ai taunt/speak
				}
			} else if(turn == false) {
				if(aiFlag) {
					//call the ai board update command
				}
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
				
				if(aiFlag) {
					statusbar.setText(ai.moveSpeak()); //makes the ai taunt/speak
				}
			} else if(turn == false) {
				if(aiFlag) {
					//call the ai board update command
				}
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
				
				if(aiFlag) {
					statusbar.setText(ai.moveSpeak()); //makes the ai taunt/speak
				}
			} else if(turn == false) {
				if(aiFlag) {
					//call the ai board update command
				}
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
				
				if(aiFlag) {
					statusbar.setText(ai.moveSpeak()); //makes the ai taunt/speak
				}
			} else if(turn == false) {
				if(aiFlag) {
					//call the ai board update command
				}
				ttt.boardUpdateO(8);
				buttray[8].setText("O");
				turn = true;
			}
		}
	}

}
