package com.game.ttt;

import javax.swing.*;
import java.awt.*;

public class GUIDisplay extends JFrame {
	public GUIDisplay() {
		initUI();
	}
	
	private void initUI() {
		
		setTitle("Tic Tac Toe Simulator 2k15: The Stats");
		setSize(250,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
