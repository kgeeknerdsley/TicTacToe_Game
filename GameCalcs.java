package com.game.ttt;

import java.util.Arrays;

public class GameCalcs {
	String gameboard[][];

	public GameCalcs() {
		gameboard = new String[3][3];
	}

	public String boardDisplay() {
		return gameboard;
	}

	public String boardUpdateX(int identifier) {
		String move = "X";

		switch(identifier) {
			case 0: gameboard[0][0] = move;
					break;
			case 1: gameboard[0][1] = move;
					break;
			case 2: gameboard[0][2] = move;
					break;
			case 3: gameboard[1][0] = move;
					break;
			case 4: gameboard[1][1] = move;
					break;
			case 5: gameboard[1][2] = move;
					break;
			case 6: gameboard[2][0] = move;
					break;
			case 7: gameboard[2][1] = move;
					break;
			case 8: gameboard[2][2] = move;
					break;
			case 9: gameboard[2][3] = move;
					break;
		}
	}


	public void testFiller() {
		for(int i = 0; i < gameboard.length; i++) {
			for(int j = 0; j < gameboard[0].length; j++) {
				gameboard[i][j] = "X";
			}
		}
	}
}
