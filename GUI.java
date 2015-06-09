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

		JMenuItem help = new JMenuItem("Help");
		help.setMnemonic(KeyEvent.VK_H);
		help.setToolTipText("Provides game instructions");

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

		file.add(resItem);
		file.add(eItem);

		settings.add(aiToggle);
		settings.addSeparator();
		settings.add(kindSet);
		settings.add(snarkSet);
		


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

	//THE BUTTON ACTIONS
	@Override
	public void actionPerformed(ActionEvent event) {
		if(null != event.getSource()) {
			if(event.getSource() instanceof Button) {
				Button button = (Button) event.getSource();
				
				if(!button.isPressed()) {
					if(turn) {
						button.setX();
						ttt.boardUpdateX(button.getID());
						turn = false;
					} else {
						button.setO();
						ttt.boardUpdateO(button.getID());
						turn = true;
					}
				} 
				
				if(ttt.winTestX()) {
					winBox("X is the winner!", "A winrar is you!"); //cannot be done in another class, gui screams
				}
				
				if(ttt.winTestO()) {
					winBox("O is the winner!", "A winrar is you!");
				}
				
				if(ttt.tieTest()) {
					winBox("Draw!", "Tie!");
				}
				
			}
		}
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
