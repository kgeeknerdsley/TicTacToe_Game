package com.game.ttt;

import java.util.Arrays;

public class GameCalcs {
	String gameboard[][];
	Boolean winrar = new Boolean(null);
	Boolean winrarX = new Boolean(null);
	Boolean winrarO = new Boolean(null);

	public GameCalcs() {
		gameboard = new String[3][3];
	}

	public void boardUpdateX(int identifier) {
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

	public void boardUpdateO(int identifier) {
		String move = "O";

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

	public boolean winTest() {
		//true if X wins, false if O wins
		if(gameboard[0][0] == "X" && gameboard[1][0] == "X" && gameboard[2][0] == "X") {
			winrar = true;
		} else if(gameboard[0][1] == "X" && gameboard[1][1] == "X" && gameboard[2][1] == "X") {
			winrar = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][2] == "X" && gameboard[2][2] == "X") {
			winrar = true;
		} else if(gameboard[0][0] == "X" && gameboard[0][1] == "X" && gameboard[0][2] == "X") {
			winrar = true;
		} else if(gameboard[1][0] == "X" && gameboard[1][1] == "X" && gameboard[1][2] == "X") {
			winrar = true;
		} else if(gameboard[2][0] == "X" && gameboard[2][1] == "X" && gameboard[2][2] == "X") {
			winrar = true;
		} else if(gameboard[0][0] == "X" && gameboard[1][1] == "X" && gameboard[2][2] == "X") {
			winrar = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][1] == "X" && gameboard[2][0] == "X") {
			winrar = true;
		} else if(gameboard[0][0] == "O" && gameboard[1][0] == "O" && gameboard[2][0] == "O") {
			winrar = false;
		} else if(gameboard[0][1] == "O" && gameboard[1][1] == "O" && gameboard[2][1] == "O") {
			winrar = false;
		} else if(gameboard[0][2] == "O" && gameboard[1][2] == "O" && gameboard[2][2] == "O") {
			winrar = false;
		} else if(gameboard[0][0] == "O" && gameboard[0][1] == "O" && gameboard[0][2] == "O") {
			winrar = false;
		} else if(gameboard[1][0] == "O" && gameboard[1][1] == "O" && gameboard[1][2] == "O") {
			winrar = false;
		} else if(gameboard[2][0] == "O" && gameboard[2][1] == "O" && gameboard[2][2] == "O") {
			winrar = false;
		} else if(gameboard[0][0] == "O" && gameboard[1][1] == "O" && gameboard[2][2] == "O") {
			winrar = false;
		} else if(gameboard[0][2] == "O" && gameboard[1][1] == "O" && gameboard[2][0] == "O") {
			winrar = false;
		}
		return winrar;
	}

	public void aiBoardUpdateRand() { //random ai moves to play

	}
}
