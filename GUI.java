package com.game.ttt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class GUI extends JFrame implements ActionListener {

	//instances of other classes in proj
	GameCalcs ttt = new GameCalcs();
	AIBrain ai = new AIBrain();

	Random randg = new Random();
	JFrame instr = new JFrame();

	Button[] buttray = new Button[9];
	int count = 0; //counts when a button is pressed
	boolean turn = true; //true for X, false for O
	boolean aiFlag = false;
	boolean aiSnark = false; //true if snarky, false if nice
	boolean aiSmart = false; //true if actually trying, false if just random
	private JLabel statusbar;

	//creates the initial windows
	public GUI() {
		initGridUI();
		initMenuUI();
	}

	//Creates window with buttons
	private void initGridUI() {

		//buttons
		JPanel panel = new JPanel();

		panel.setBorder(BorderFactory.createEmptyBorder(3,3,5,5));
		panel.setLayout(new GridLayout(3,3,10,10));

		for(int i = 0; i < 9; i++) {
			buttray[i] = new Button(i);
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

		JMenu settings = new JMenu("AI Settings");
		settings.setMnemonic(KeyEvent.VK_S);

		JMenuItem hItem = new JMenuItem("Help");
		hItem.setMnemonic(KeyEvent.VK_H);
		hItem.setToolTipText("Provides author information and game instructions");

		JMenuItem instItem = new JMenuItem("Instructions");
		instItem.setToolTipText("How to play");
		instItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event4) {

			}
		});

		JMenuItem kindSetting = new JMenuItem("AI Personality");
		kindSetting.setToolTipText("Changes whether the AI is nice or snarky");

		JMenuItem kindSet = new JMenuItem("Kind AI Personality");
		kindSet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event2) {
				aiSnark = false;
			}
		});

		JMenuItem snarkSet = new JMenuItem("Snarky AI Personality");
		snarkSet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event3) {
				aiSnark = true;
			}
		});

		//menu item for exit game
		JMenuItem eItem = new JMenuItem("Exit"); //add icon as second parameter later
		eItem.setMnemonic(KeyEvent.VK_E);
		eItem.setToolTipText("Exit game");
		eItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});

		//menu item for new game
		JMenuItem resItem = new JMenuItem("New Game");
		resItem.setMnemonic(KeyEvent.VK_N);
		resItem.setToolTipText("Restarts the game");
		resItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event2) {
				gameRestart();
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
					aiFlag = false;
				}
			}
		});

		//menu addition hierarchy (ARE IN ORDER, DO NOT SCREW WITH PLZ)
		menu.add(file);
		menu.add(settings);
		menu.add(hItem);

		file.add(resItem);
		file.add(eItem);

		settings.add(aiToggle);
		settings.addSeparator();
		settings.add(kindSet);
		settings.add(snarkSet);


		setJMenuBar(menu);
	}

	public void instructionBox() {
		instr.setTitle("Instructions");
	}

	//called to restart game from menu option
	public void gameRestart() {
		dispose();
		GUI guires = new GUI();
		guires.setVisible(true);
	}

	//box that displays win, restarts game
	public void winBox(String message, String title) {
		JOptionPane.showMessageDialog(null, message, "" + title, JOptionPane.INFORMATION_MESSAGE);
		dispose();
		GUI wingui = new GUI();
		wingui.setVisible(true);
	}

	public void messageBox(String message, String title) {
		JOptionPane.showMessageDialog(null, message, "" + title, JOptionPane.ERROR_MESSAGE);
	}

	//THE BUTTON ACTIONS
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == buttray[0]) { //upper left
			if(!buttray[0].isPressed()) {
				if(turn) {
					buttray[0].pressedX();

					if(ttt.winTestX()) {
						winBox("X is the winner!", "A winrar is you!"); //cannot be done in another class, gui screams
					}

					turn = false;

					if(aiFlag) {
						if(aiSnark) {
							statusbar.setText(ai.moveSpeakSnarky());
						} else {
							statusbar.setText(ai.moveSpeakNice());
						}
					}
					
				} else if(turn == false) {
					if(!buttray[0].isPressed()) {
						buttray[0].setPress(true);
						
						buttray[0].pressedO();

						if(ttt.winTestO()) {
							winBox("O is the winner!", "A winrar is you!");
						}

						turn = true;
					}
				}
				
			} else {
				messageBox("Illegal move!", "Oops!");
			}
		}

		if(event.getSource() == buttray[1]) { //upper middle
			if(!buttray[1].isPressed()) {
				if(turn) {
					buttray[1].pressedX();
					if(ttt.winTestX()) {
						winBox("X is the winner!", "A winrar is you!");
					}
					turn = false;

					if(aiFlag) {
						if(aiSnark) {
							statusbar.setText(ai.moveSpeakSnarky());
						} else {
							statusbar.setText(ai.moveSpeakNice());
						}
					}
				} else if(turn == false) {
					if(!buttray[1].isPressed()) {
						buttray[1].setPress(true);
						
						buttray[1].pressedO();
						if(ttt.winTestO()) {
							winBox("O is the winner!", "A winrar is you!");
						}
						turn = true;
					}
				}
			} else {
				messageBox("Illegal move!", "Oops!");
			}
		}

		if(event.getSource() == buttray[2]) { //upper right
			if(!buttray[2].isPressed()) {
				if(turn) {
					buttray[2].pressedX();
					if(ttt.winTestX()) {
						winBox("X is the winner!", "A winrar is you!");
					}
					turn = false;

					if(aiFlag) {
						if(aiSnark) {
							statusbar.setText(ai.moveSpeakSnarky());
						} else {
							statusbar.setText(ai.moveSpeakNice());
						}
					}
				} else if(turn == false) {
					if(!buttray[2].isPressed()) {
						buttray[2].setPress(true);
						
						buttray[2].pressedO();
						if(ttt.winTestO()) {
							System.out.println("Game over!");
							winBox("O is the winner!", "A winrar is you!");
						}
						turn = true;
					}

					
				}
			} else {
				messageBox("Illegal move!", "Oops!");
			}
		}

		if(event.getSource() == buttray[3]) { //middle left
			if(!buttray[3].isPressed()) {
				if(turn) {
					buttray[3].pressedX();
					if(ttt.winTestX()) {
						winBox("X is the winner!", "A winrar is you!");
					}
					turn = false;

					if(aiFlag) {
						if(aiSnark) {
							statusbar.setText(ai.moveSpeakSnarky());
						} else {
							statusbar.setText(ai.moveSpeakNice());
						}
					}
				} else if(turn == false) {
					if(!buttray[3].isPressed()) {
						buttray[3].setPress(true);
						
						buttray[3].pressedO();
						if(ttt.winTestO()) {
							System.out.println("Game over!");
							winBox("O is the winner!", "A winrar is you!");
						}
						turn = true;
					}
				}
			} else {
				messageBox("Illegal move!", "Oops!");
			}
		}

		if(event.getSource() == buttray[4]) { //middle middle
			if(!buttray[4].isPressed()) {
				if(turn) {
					buttray[4].pressedX();
					if(ttt.winTestX()) {
						winBox("X is the winner!", "A winrar is you!");
					}
					turn = false;

					if(aiFlag) {
						if(aiSnark) {
							statusbar.setText(ai.moveSpeakSnarky());
						} else {
							statusbar.setText(ai.moveSpeakNice());
						}
					}
				} else if(turn == false) {
					if(!buttray[4].isPressed()) {
						buttray[4].setPress(true);
					}
					buttray[4].pressedO();
					
					if(ttt.winTestO()) {
						winBox("O is the winner!", "A winrar is you!");
					}
					turn = true;
				}
			} else {
				messageBox("Illegal move!", "Oops!");
			}
		}

		if(event.getSource() == buttray[5]) { //middle right
			if(!buttray[5].isPressed()) {
				if(turn) {
					buttray[5].pressedX();
					
					if(ttt.winTestX()) {
						winBox("X is the winner!", "A winrar is you!");
					}
					turn = false;

					if(aiFlag) {
						if(aiSnark) {
							statusbar.setText(ai.moveSpeakSnarky());
						} else {
							statusbar.setText(ai.moveSpeakNice());
						}
					}
				} else if(turn == false) {
					if(!buttray[5].isPressed()) {
						buttray[5].setPress(true);
						
						buttray[5].pressedO();
						if(ttt.winTestO()) {
							System.out.println("Game over!");
							winBox("O is the winner!", "A winrar is you!");
						}
						turn = true;
					}	
				}
			} else {
				messageBox("Illegal move!", "Oops!");
			}
		}

		if(event.getSource() == buttray[6]) { //bottom left
			if(!buttray[6].isPressed()) {
				if(turn) {
					buttray[6].pressedX();
					if(ttt.winTestX()) {
						System.out.println("Game over!");
						winBox("X is the winner!", "A winrar is you!");
					}
					turn = false;

					if(aiFlag) {
						if(aiSnark) {
							statusbar.setText(ai.moveSpeakSnarky());
						} else {
							statusbar.setText(ai.moveSpeakNice());
						}
					}
				} else if(turn == false) {
					if(!buttray[6].isPressed()) {
						buttray[6].setPress(true);
						
						buttray[6].pressedO();
						if(ttt.winTestO()) {
							winBox("O is the winner!", "A winrar is you!");
						}
						turn = true;
					}
				}
			} else {
				messageBox("Illegal move!", "Oops!");
			}
		}

		if(event.getSource() == buttray[7]) { //bottom middle
			if(!buttray[7].isPressed()) {
				if(turn) {
					buttray[7].pressedX();
					if(ttt.winTestX()) {
						winBox("X is the winner!", "A winrar is you!");
					}
					turn = false;

					if(aiFlag) {
						if(aiSnark) {
							statusbar.setText(ai.moveSpeakSnarky());
						} else {
							statusbar.setText(ai.moveSpeakNice());
						}
					}
				} else if(turn == false) {
					if(!buttray[7].isPressed()) {
						buttray[7].setPress(true);
					}

					buttray[7].pressedO();
					if(ttt.winTestO()) {
						winBox("O is the winner!", "A winrar is you!");
					}
					turn = true;
				}
			} else {
				messageBox("Illegal move!", "Oops!");
			}
		}

		if(event.getSource() == buttray[8]) { //bottom right
			if(!buttray[8].isPressed()) {
				if(turn) {
					buttray[8].pressedX();
					if(ttt.winTestX()) {
						winBox("X is the winner!", "A winrar is you!");
					}
					turn = false;

					if(aiFlag) {
						if(aiSnark) {
							statusbar.setText(ai.moveSpeakSnarky());
						} else {
							statusbar.setText(ai.moveSpeakNice());
						}
					}
				} else if(turn == false) {
					if(!buttray[8].isPressed()) {
						buttray[8].setPress(true);
						
						buttray[8].pressedO();
						if(ttt.winTestO()) {
							System.out.println("Game over!");
							winBox("O is the winner!", "A winrar is you!");
						}
						turn = true;
					}
				}
			}
		}
	
	if(ttt.tieTest()) {
		winBox("You've tied!", "Sucks to your assmar"); //i am broken, something's up!
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GUI gui = new GUI();
				gui.setVisible(true);
			}
		});
	}
}
