package com.game.ttt;

import java.util.Random;

public class GameCalcs {
	Random randgen = new Random();

	String gameboard[][];
	Boolean winrar = new Boolean(null);
	Boolean winrarX = new Boolean(null);
	Boolean winrarO = new Boolean(null);

	Integer rowNum = new Integer(0);
	Integer colNum = new Integer(0);
//Change was done in GameCalcs to make a 9 by 9 grid checker
	public GameCalcs() {
		gameboard = new String[9][9];
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

	public int buttonTranslator(int row, int col) {
		if(row == 0 && col == 0) {
			return 0;
		}

		if(row == 0 && col == 1) {
			return 1;
		}

		if(row == 0 && col == 2) {
			return 2;
		}

		if(row == 1 && col == 0) {
			return 3;
		}

		if(row == 1 && col == 1) {
			return 4;
		}

		if(row == 1 && col == 2) {
			return 5;
		}

		if(row == 2 && col == 0) {
			return 6;
		}

		if(row == 2 && col == 1) {
			return 7;
		}

		if(row == 2 && col == 2) {
			return 8;
		}

		return -1;
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

	public int aiUpdateRand(Integer rowNum, Integer colNum) {
		if(gameboard[rowNum][colNum] != null) {
			gameboard[rowNum][colNum] = "O";
		} else {
			int newrow = randgen.nextInt(3);
			int newcol = randgen.nextInt(3);

			aiUpdateRand(newrow, newcol);
		}

		return buttonTranslator(rowNum, colNum);
	}

	public int getRow() {
		return rowNum;
	}

	public int getCol() {
		return colNum;
	}

	public int randomMove() {
		int num = randgen.nextInt(3);
		return num;
	}

//Wintests for each sector, X
	public boolean winTestXTopLeft() {
		if(gameboard[0][0] == "X" && gameboard[1][0] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else if(gameboard[0][1] == "X" && gameboard[1][1] == "X" && gameboard[2][1] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][2] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[0][1] == "X" && gameboard[0][2] == "X") {
			winrarX = true;
		} else if(gameboard[1][0] == "X" && gameboard[1][1] == "X" && gameboard[1][2] == "X") {
			winrarX = true;
		} else if(gameboard[2][0] == "X" && gameboard[2][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[1][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][1] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else {
			winrarX = false;
		}
		return winrarX;
	}

	public boolean winTestXTopCenter() {
		if(gameboard[0][0] == "X" && gameboard[1][0] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else if(gameboard[0][1] == "X" && gameboard[1][1] == "X" && gameboard[2][1] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][2] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[0][1] == "X" && gameboard[0][2] == "X") {
			winrarX = true;
		} else if(gameboard[1][0] == "X" && gameboard[1][1] == "X" && gameboard[1][2] == "X") {
			winrarX = true;
		} else if(gameboard[2][0] == "X" && gameboard[2][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[1][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][1] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else {
			winrarX = false;
		}
		return winrarX;
	}

	public boolean winTestXTopRight() {
		if(gameboard[0][0] == "X" && gameboard[1][0] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else if(gameboard[0][1] == "X" && gameboard[1][1] == "X" && gameboard[2][1] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][2] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[0][1] == "X" && gameboard[0][2] == "X") {
			winrarX = true;
		} else if(gameboard[1][0] == "X" && gameboard[1][1] == "X" && gameboard[1][2] == "X") {
			winrarX = true;
		} else if(gameboard[2][0] == "X" && gameboard[2][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[1][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][1] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else {
			winrarX = false;
		}
		return winrarX;
	}

	public boolean winTestXMiddleLeft() {
		if(gameboard[0][0] == "X" && gameboard[1][0] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else if(gameboard[0][1] == "X" && gameboard[1][1] == "X" && gameboard[2][1] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][2] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[0][1] == "X" && gameboard[0][2] == "X") {
			winrarX = true;
		} else if(gameboard[1][0] == "X" && gameboard[1][1] == "X" && gameboard[1][2] == "X") {
			winrarX = true;
		} else if(gameboard[2][0] == "X" && gameboard[2][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[1][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][1] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else {
			winrarX = false;
		}
		return winrarX;
	}

	public boolean winTestXMiddleCenter() {
		if(gameboard[0][0] == "X" && gameboard[1][0] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else if(gameboard[0][1] == "X" && gameboard[1][1] == "X" && gameboard[2][1] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][2] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[0][1] == "X" && gameboard[0][2] == "X") {
			winrarX = true;
		} else if(gameboard[1][0] == "X" && gameboard[1][1] == "X" && gameboard[1][2] == "X") {
			winrarX = true;
		} else if(gameboard[2][0] == "X" && gameboard[2][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[1][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][1] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else {
			winrarX = false;
		}
		return winrarX;
	}

	public boolean winTestXMiddleRight() {
		if(gameboard[0][0] == "X" && gameboard[1][0] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else if(gameboard[0][1] == "X" && gameboard[1][1] == "X" && gameboard[2][1] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][2] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[0][1] == "X" && gameboard[0][2] == "X") {
			winrarX = true;
		} else if(gameboard[1][0] == "X" && gameboard[1][1] == "X" && gameboard[1][2] == "X") {
			winrarX = true;
		} else if(gameboard[2][0] == "X" && gameboard[2][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[1][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][1] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else {
			winrarX = false;
		}
		return winrarX;
	}

	public boolean winTestXBottomLeft() {
		if(gameboard[0][0] == "X" && gameboard[1][0] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else if(gameboard[0][1] == "X" && gameboard[1][1] == "X" && gameboard[2][1] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][2] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[0][1] == "X" && gameboard[0][2] == "X") {
			winrarX = true;
		} else if(gameboard[1][0] == "X" && gameboard[1][1] == "X" && gameboard[1][2] == "X") {
			winrarX = true;
		} else if(gameboard[2][0] == "X" && gameboard[2][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[1][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][1] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else {
			winrarX = false;
		}
		return winrarX;
	}

	public boolean winTestXBottomCenter() {
		if(gameboard[0][0] == "X" && gameboard[1][0] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else if(gameboard[0][1] == "X" && gameboard[1][1] == "X" && gameboard[2][1] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][2] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[0][1] == "X" && gameboard[0][2] == "X") {
			winrarX = true;
		} else if(gameboard[1][0] == "X" && gameboard[1][1] == "X" && gameboard[1][2] == "X") {
			winrarX = true;
		} else if(gameboard[2][0] == "X" && gameboard[2][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[1][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][1] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else {
			winrarX = false;
		}
		return winrarX;
	}

	public boolean winTestXBottomRight() {
		if(gameboard[0][0] == "X" && gameboard[1][0] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else if(gameboard[0][1] == "X" && gameboard[1][1] == "X" && gameboard[2][1] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][2] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[0][1] == "X" && gameboard[0][2] == "X") {
			winrarX = true;
		} else if(gameboard[1][0] == "X" && gameboard[1][1] == "X" && gameboard[1][2] == "X") {
			winrarX = true;
		} else if(gameboard[2][0] == "X" && gameboard[2][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[1][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][1] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else {
			winrarX = false;
		}
		return winrarX;
	}

//Original winTest for o
	public boolean winTestOTopLeft() {
		if(gameboard[0][0] == "O" && gameboard[1][0] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else if(gameboard[0][1] == "O" && gameboard[1][1] == "O" && gameboard[2][1] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][2] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[0][1] == "O" && gameboard[0][2] == "O") {
			winrarO = true;
		} else if(gameboard[1][0] == "O" && gameboard[1][1] == "O" && gameboard[1][2] == "O") {
			winrarO = true;
		} else if(gameboard[2][0] == "O" && gameboard[2][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[1][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][1] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else {
			winrarO = false;
		}
		return winrarO;
	}

	public boolean winTestOTopCenter() {
		if(gameboard[0][0] == "O" && gameboard[1][0] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else if(gameboard[0][1] == "O" && gameboard[1][1] == "O" && gameboard[2][1] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][2] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[0][1] == "O" && gameboard[0][2] == "O") {
			winrarO = true;
		} else if(gameboard[1][0] == "O" && gameboard[1][1] == "O" && gameboard[1][2] == "O") {
			winrarO = true;
		} else if(gameboard[2][0] == "O" && gameboard[2][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[1][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][1] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else {
			winrarO = false;
		}
		return winrarO;
	}

	public boolean winTestOTopRight() {
		if(gameboard[0][0] == "O" && gameboard[1][0] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else if(gameboard[0][1] == "O" && gameboard[1][1] == "O" && gameboard[2][1] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][2] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[0][1] == "O" && gameboard[0][2] == "O") {
			winrarO = true;
		} else if(gameboard[1][0] == "O" && gameboard[1][1] == "O" && gameboard[1][2] == "O") {
			winrarO = true;
		} else if(gameboard[2][0] == "O" && gameboard[2][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[1][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][1] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else {
			winrarO = false;
		}
		return winrarO;
	}

	public boolean winTestOMiddleLeft() {
		if(gameboard[0][0] == "O" && gameboard[1][0] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else if(gameboard[0][1] == "O" && gameboard[1][1] == "O" && gameboard[2][1] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][2] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[0][1] == "O" && gameboard[0][2] == "O") {
			winrarO = true;
		} else if(gameboard[1][0] == "O" && gameboard[1][1] == "O" && gameboard[1][2] == "O") {
			winrarO = true;
		} else if(gameboard[2][0] == "O" && gameboard[2][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[1][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][1] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else {
			winrarO = false;
		}
		return winrarO;
	}

	public boolean winTestOMiddleCenter() {
		if(gameboard[0][0] == "O" && gameboard[1][0] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else if(gameboard[0][1] == "O" && gameboard[1][1] == "O" && gameboard[2][1] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][2] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[0][1] == "O" && gameboard[0][2] == "O") {
			winrarO = true;
		} else if(gameboard[1][0] == "O" && gameboard[1][1] == "O" && gameboard[1][2] == "O") {
			winrarO = true;
		} else if(gameboard[2][0] == "O" && gameboard[2][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[1][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][1] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else {
			winrarO = false;
		}
		return winrarO;
	}

	public boolean winTestOMiddleRight() {
		if(gameboard[0][0] == "O" && gameboard[1][0] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else if(gameboard[0][1] == "O" && gameboard[1][1] == "O" && gameboard[2][1] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][2] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[0][1] == "O" && gameboard[0][2] == "O") {
			winrarO = true;
		} else if(gameboard[1][0] == "O" && gameboard[1][1] == "O" && gameboard[1][2] == "O") {
			winrarO = true;
		} else if(gameboard[2][0] == "O" && gameboard[2][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[1][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][1] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else {
			winrarO = false;
		}
		return winrarO;
	}

	public boolean winTestOBottomLeft() {
		if(gameboard[0][0] == "O" && gameboard[1][0] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else if(gameboard[0][1] == "O" && gameboard[1][1] == "O" && gameboard[2][1] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][2] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[0][1] == "O" && gameboard[0][2] == "O") {
			winrarO = true;
		} else if(gameboard[1][0] == "O" && gameboard[1][1] == "O" && gameboard[1][2] == "O") {
			winrarO = true;
		} else if(gameboard[2][0] == "O" && gameboard[2][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[1][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][1] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else {
			winrarO = false;
		}

		return winrarO;
	}

	public boolean winTestOBottomCenter() {
		if(gameboard[0][0] == "O" && gameboard[1][0] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else if(gameboard[0][1] == "O" && gameboard[1][1] == "O" && gameboard[2][1] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][2] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[0][1] == "O" && gameboard[0][2] == "O") {
			winrarO = true;
		} else if(gameboard[1][0] == "O" && gameboard[1][1] == "O" && gameboard[1][2] == "O") {
			winrarO = true;
		} else if(gameboard[2][0] == "O" && gameboard[2][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[1][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][1] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else {
			winrarO = false;
		}
		return winrarO;
	}

	public boolean winTestOBottomRight() {
		if(gameboard[0][0] == "O" && gameboard[1][0] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else if(gameboard[0][1] == "O" && gameboard[1][1] == "O" && gameboard[2][1] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][2] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[0][1] == "O" && gameboard[0][2] == "O") {
			winrarO = true;
		} else if(gameboard[1][0] == "O" && gameboard[1][1] == "O" && gameboard[1][2] == "O") {
			winrarO = true;
		} else if(gameboard[2][0] == "O" && gameboard[2][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[1][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][1] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else {
			winrarO = false;
		}
		return winrarO;
	}

//Big Board Checker
	public boolean winTestOBigBoard() {
		if(gameboard[0][0] == "O" && gameboard[1][0] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else if(gameboard[0][1] == "O" && gameboard[1][1] == "O" && gameboard[2][1] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][2] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[0][1] == "O" && gameboard[0][2] == "O") {
			winrarO = true;
		} else if(gameboard[1][0] == "O" && gameboard[1][1] == "O" && gameboard[1][2] == "O") {
			winrarO = true;
		} else if(gameboard[2][0] == "O" && gameboard[2][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][0] == "O" && gameboard[1][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
		} else if(gameboard[0][2] == "O" && gameboard[1][1] == "O" && gameboard[2][0] == "O") {
			winrarO = true;
		} else {
			winrarO = false;
		}
		return winrarO;
	}

	public boolean winTestXBigBoard() {
		if(gameboard[0][0] == "X" && gameboard[1][0] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else if(gameboard[0][1] == "X" && gameboard[1][1] == "X" && gameboard[2][1] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][2] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[0][1] == "X" && gameboard[0][2] == "X") {
			winrarX = true;
		} else if(gameboard[1][0] == "X" && gameboard[1][1] == "X" && gameboard[1][2] == "X") {
			winrarX = true;
		} else if(gameboard[2][0] == "X" && gameboard[2][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][0] == "X" && gameboard[1][1] == "X" && gameboard[2][2] == "X") {
			winrarX = true;
		} else if(gameboard[0][2] == "X" && gameboard[1][1] == "X" && gameboard[2][0] == "X") {
			winrarX = true;
		} else {
			winrarX = false;
		}
		return winrarX;
	}



	public int buttonTally() {
		int buttally = 0;

		buttally++;

		return buttally;
	}

//
//We will also need a tie detector for small board ties
//
	public boolean tieTest() {
		int fillcount = 0;
		boolean nulltest = false; // returns true if the test passes (no null values)
		boolean wintestXBigBoard = false;
		boolean wintestOBigBoard = false;

		for(int row = 0; row < gameboard.length; row++) {
			for(int col = 0; col < gameboard[0].length; col++) {
				if(gameboard[row][col] != null) {
					fillcount++;
				}
			}
		}

		if(fillcount == 9) {
			nulltest = true;
		}

		if(!winTestX()) {
			wintestX = true;
		}

		if(!winTestO()) {
			wintestO = true;
		}

		if(nulltest && wintestX && wintestO) {
			return true;
		} else {
			return false;
		}

	}

	public void boardPrinter() {
		String tempboard = "";
		for(int row = 0; row < gameboard.length; row++) {
			for(int col = 0; col < gameboard[0].length; col++) {
				tempboard += gameboard[row][col];
			}
		}

		System.out.println(tempboard);
	}
}
