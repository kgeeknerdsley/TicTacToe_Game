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
	Timer timer = new Timer();

	JButton[] buttray = new JButton[9];
	int count = 0; //counts when a button is pressed
	boolean turn = true; //true for X, false for O
	boolean aiFlag = false;
	boolean aiSnark = false; //true if snarky, false if nice
	boolean aiSmart = false; //true if actually trying, false if just random
	private JLabel statusbar;
	
	//button pressed flags
	boolean but0 = false;
	boolean but1 = false;
	boolean but2 = false;
	boolean but3 = false;
	boolean but4 = false;
	boolean but5 = false;
	boolean but6 = false;
	boolean but7 = false;
	boolean but8 = false;
	

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

		JMenu settings = new JMenu("AI Settings");
		settings.setMnemonic(KeyEvent.VK_S);

		JMenuItem hItem = new JMenuItem("Help");
		hItem.setMnemonic(KeyEvent.VK_H);
		hItem.setToolTipText("Provides author information and game instructions");

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
		file.add(resItem);
		file.add(eItem);

		settings.add(aiToggle);
		settings.addSeparator();
		settings.add(kindSet);
		settings.add(snarkSet);
		
		menu.add(file);
		menu.add(settings);
		menu.add(hItem);

		setJMenuBar(menu);
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

	//the main, runs the initial program
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GUI gui = new GUI();
				gui.setVisible(true);
			}
		});
	}

	//THE BUTTON ACTIONS
	@Override
	public void actionPerformed(ActionEvent event) {
		//debug commands, leave commented out if not needed/remove for release
		//System.out.println(event.getActionCommand());
		//System.out.println(event.paramString());

		if(event.getSource() == buttray[0]) { //upper left
			if(but0 == false) {
				if(turn) {
					but0 = true;
					ttt.boardUpdateX(0);
					buttray[0].setText("X");
	
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
					if(but0 == false) {
						but0 = true;
					}
					
					if(aiFlag) {
						//call the ai board update command
					}
					ttt.boardUpdateO(0);
					buttray[0].setText("O");
					
					if(ttt.winTestO()) {
						System.out.println("Game over!");
						winBox("O is the winner!", "A winrar is you!");
					}
					
					turn = true;
				}
			} else {
				messageBox("Illegal move!", "Oops!");
			}
		}

		if(event.getSource() == buttray[1]) { //upper middle
			if(but1 == false) {
				if(turn) {
					;
					ttt.boardUpdateX(1);
					buttray[1].setText("X");
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
					if(but1 == false) {
						but1 = true;
					}
					
					if(aiFlag) {
						//call the ai board update command
					}
					ttt.boardUpdateO(1);
					buttray[1].setText("O");
					if(ttt.winTestO()) {
						System.out.println("Game over!");
						winBox("O is the winner!", "A winrar is you!");
						
					}
					turn = true;
				}
			} else {
				messageBox("Illegal move!", "Oops!");
			}
		}

		if(event.getSource() == buttray[2]) { //upper right
			if(but2 == false) {
				if(turn) {
					ttt.boardUpdateX(2);
					buttray[2].setText("X");
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
					if(but2 == false) {
						but2 = true;
					}
					
					if(aiFlag) {
						//call the ai board update command
					}
					ttt.boardUpdateO(2);
					buttray[2].setText("O");
					if(ttt.winTestO()) {
						System.out.println("Game over!");
						winBox("O is the winner!", "A winrar is you!");
					}
					turn = true;
				}
			} else {
				messageBox("Illegal move!", "Oops!");
			}
		}

		if(event.getSource() == buttray[3]) { //middle left
			if(but3 == false) {
				if(turn) {
					ttt.boardUpdateX(3);
					buttray[3].setText("X");
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
					if(but3 == false) {
						but3 = true;
					}
					
					if(aiFlag) {
						//call the ai board update command
					}
					ttt.boardUpdateO(3);
					buttray[3].setText("O");
					if(ttt.winTestO()) {
						System.out.println("Game over!");
						winBox("O is the winner!", "A winrar is you!");
					}
					turn = true;
				}
			} else {
				messageBox("Illegal move!", "Oops!");
			}
		}

		if(event.getSource() == buttray[4]) { //middle middle
			if(but4 == false) {
				if(turn) {
					ttt.boardUpdateX(4);
					buttray[4].setText("X");
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
					if(but4 == false) {
						but4 = true;
					}
					
					if(aiFlag) {
						//call the ai board update command
					}
					ttt.boardUpdateO(4);
					buttray[4].setText("O");
					if(ttt.winTestO()) {
						System.out.println("Game over!");
						winBox("O is the winner!", "A winrar is you!");
					}
					turn = true;
				}
			} else {
				messageBox("Illegal move!", "Oops!");
			}
		}

		if(event.getSource() == buttray[5]) { //middle right
			if(but5 == false) {
				if(turn) {
					ttt.boardUpdateX(5);
					buttray[5].setText("X");
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
					if(but5 == false) {
						but5 = true;
					}
					if(aiFlag) {
						//call the ai board update command
					}
					ttt.boardUpdateO(5);
					buttray[5].setText("O");
					if(ttt.winTestO()) {
						System.out.println("Game over!");
						winBox("O is the winner!", "A winrar is you!");
					}
					turn = true;
				}
			} else {
				messageBox("Illegal move!", "Oops!");
			}
		}

		if(event.getSource() == buttray[6]) { //bottom left
			if(but6 == false) {
				if(turn) {
					ttt.boardUpdateX(6);
					buttray[6].setText("X");
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
					if(but6 == false) {
						but6 = true;
					}
					if(aiFlag) {
						//call the ai board update command
					}
					ttt.boardUpdateO(6);
					buttray[6].setText("O");
					if(ttt.winTestO()) {
						System.out.println("Game over!");
						winBox("O is the winner!", "A winrar is you!");
					}
					turn = true;
				}
			} else {
				messageBox("Illegal move!", "Oops!");
			}
		}

		if(event.getSource() == buttray[7]) { //bottom middle
			if(but7 == false) {
				if(turn) {
					ttt.boardUpdateX(7);
					buttray[7].setText("X");
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
					if(but7 == false) {
						but7 = true;
					}
					
					if(aiFlag) {
						//call the ai board update command
					}
					ttt.boardUpdateO(7);
					buttray[7].setText("O");
					if(ttt.winTestO()) {
						System.out.println("Game over!");
						winBox("O is the winner!", "A winrar is you!");
					}
					turn = true;
				}
			} else {
				messageBox("Illegal move!", "Oops!");
			}
		}

		if(event.getSource() == buttray[8]) { //bottom right
			if(but8 == false) {
				if(turn) {
					ttt.boardUpdateX(8);
					buttray[8].setText("X");
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
					if(but8 == false) {
						but8 = true;
					}
					if(aiFlag) {
						//call the ai board update command
					}
					ttt.boardUpdateO(8);
					buttray[8].setText("O");
					if(ttt.winTestO()) {
						System.out.println("Game over!");
						winBox("O is the winner!", "A winrar is you!");
					}
					turn = true;
				}
				
				if(ttt.winTestX() == false && ttt.winTestO() == false && butFlagState()) {
					winBox("You're both losers! You tied!", "No one is the winrar.");
				}
			} else {
				messageBox("Illegal move!", "Oops!");
			}
		} 
	}

	public boolean butFlagState() {
		if(but0 && but1 && but2 && but3 && but4 && but5 && but6 && but7 && but8) {
			return true;
		} else {
			return false;
		}
	}
}
