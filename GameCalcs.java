package com.game.ttt;

import java.util.Arrays;

public class GameCalcs {
	String gameboard[][];
	
	public GameCalcs() {
		gameboard = new String[3][3];
	}
	
	public String boardDisplay() {
		testFiller();
		return Arrays.toString(gameboard);
	}
	
	
	public void testFiller() {
		for(int i = 0; i < gameboard.length; i++) {
			for(int j = 0; j < gameboard[0].length; j++) {
				gameboard[i][j] = "X";
			}
		}
	}
}
