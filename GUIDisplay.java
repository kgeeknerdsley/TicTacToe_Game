package com.game.ttt;

import javax.swing.*;
import java.awt.*;

public class GUIDisplay extends JFrame {
	GameCalcs ttt = new GameCalcs();
	boolean gameRunning = true;
	
	public GUIDisplay() {
		initUI();
	}
	
	private void initUI() {
		JLabel board = new JLabel(ttt.boardDisplay());
		board.setForeground(new Color(50, 50 ,25));
		
		createLayout(board);
		
		setTitle("Tic Tac Toe Simulator 2k15: The Stats");
		setSize(250,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//while(gameRunning) {
			board.setText(ttt.boardDisplay());
		//}
		
	}
	
	private void createLayout(JComponent... arg) {
		Container pane = getContentPane();
		GroupLayout gl = new GroupLayout(pane);
		pane.setLayout(gl);
		
		gl.setAutoCreateContainerGaps(true);
		
		gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]));
		gl.setVerticalGroup(gl.createSequentialGroup().addComponent(arg[0]));
		
		pack();
	}
}
