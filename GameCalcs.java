package com.game.ttt;

import java.util.Random;

public class GameCalcs {
	Random randgen = new Random();

	String gameboard[][];
	Boolean gameboardBigBoard[][];
	Boolean winrar = new Boolean(null);
	Boolean winrarX = new Boolean(null);
	Boolean winrarO = new Boolean(null);

	Integer rowNum = new Integer(0);
	Integer colNum = new Integer(0);
//Change was done in GameCalcs to make a 9 by 9 grid checker
	public GameCalcs() {
		gameboard = new String[9][9];
		gameboardBigBoard = new String[3][3];
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
			case 3: gameboard[0][3] = move;
				break;
			case 4: gameboard[0][4] = move;
				break;
			case 5: gameboard[0][5] = move;
				break;
			case 6: gameboard[0][6] = move;
				break;
			case 7: gameboard[0][7] = move;
				break;
			case 8: gameboard[0][8] = move;
				break;
			case 9: gameboard[0][9] = move;
				break;
			case 10: gameboard[1][0] = move;
				break;
			case 11: gameboard[1][1] = move;
				break;
			case 12: gameboard[1][2] = move;
				break;
			case 13: gameboard[1][3] = move;
				break;
			case 14: gameboard[1][4] = move;
				break;
			case 15: gameboard[1][5] = move;
				break;
			case 16: gameboard[1][6] = move;
				break;
			case 17: gameboard[1][7] = move;
				break;
			case 18: gameboard[1][8] = move;
				break;
			case 19: gameboard[1][9] = move;
				break;
			case 20: gameboard[2][0] = move;
				break;
			case 21: gameboard[2][1] = move;
				break;
			case 22: gameboard[2][2] = move;
				break;
			case 23: gameboard[2][3] = move;
				break;
			case 24: gameboard[2][4] = move;
				break;
			case 25: gameboard[2][5] = move;
				break;
			case 26: gameboard[2][6] = move;
				break;
			case 27: gameboard[2][7] = move;
				break;
			case 28: gameboard[2][8] = move;
				break;
			case 29: gameboard[2][9] = move;
				break;
			case 30: gameboard[3][0] = move;
				break;
			case 31: gameboard[3][1] = move;
				break;
			case 32: gameboard[3][2] = move;
				break;
			case 33: gameboard[3][3] = move;
				break;
			case 34: gameboard[3][4] = move;
				break;
			case 35: gameboard[3][5] = move;
				break;
			case 36: gameboard[3][6] = move;
				break;
			case 37: gameboard[3][7] = move;
				break;
			case 38: gameboard[3][8] = move;
				break;
			case 39: gameboard[3][9] = move;
				break;
			case 40: gameboard[4][0] = move;
				break;
			case 41: gameboard[4][1] = move;
				break;
			case 42: gameboard[4][2] = move;
				break;
			case 43: gameboard[4][3] = move;
				break;
			case 44: gameboard[4][4] = move;
				break;
			case 45: gameboard[4][5] = move;
				break;
			case 46: gameboard[4][6] = move;
				break;
			case 47: gameboard[4][7] = move;
				break;
			case 48: gameboard[4][8] = move;
				break;
			case 49: gameboard[4][9] = move;
				break;
			case 50: gameboard[5][0] = move;
				break;
			case 51: gameboard[5][1] = move;
				break;
			case 52: gameboard[5][2] = move;
				break;
			case 53: gameboard[5][3] = move;
				break;
			case 54: gameboard[5][4] = move;
				break;
			case 55: gameboard[5][5] = move;
				break;
			case 56: gameboard[5][6] = move;
				break;
			case 57: gameboard[5][7] = move;
				break;
			case 58: gameboard[5][8] = move;
				break;
			case 59: gameboard[5][9] = move;
				break;
			case 60: gameboard[6][0] = move;
				break;
			case 61: gameboard[6][1] = move;
				break;
			case 62: gameboard[6][2] = move;
				break;
			case 63: gameboard[6][3] = move;
				break;
			case 64: gameboard[6][4] = move;
				break;
			case 65: gameboard[6][5] = move;
				break;
			case 66: gameboard[6][6] = move;
				break;
			case 67: gameboard[6][7] = move;
				break;
			case 68: gameboard[6][8] = move;
				break;
			case 69: gameboard[6][9] = move;
				break;
			case 70: gameboard[7][0] = move;
				break;
			case 71: gameboard[7][1] = move;
				break;
			case 72: gameboard[7][2] = move;
				break;
			case 73: gameboard[7][3] = move;
				break;
			case 74: gameboard[7][4] = move;
				break;
			case 75: gameboard[7][5] = move;
				break;
			case 76: gameboard[7][6] = move;
				break;
			case 77: gameboard[7][7] = move;
				break;
			case 78: gameboard[7][8] = move;
				break;
			case 79: gameboard[7][9] = move;
				break;
			case 80: gameboard[8][0] = move;
				break;
			case 81: gameboard[8][1] = move;
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
			case 3: gameboard[0][3] = move;
				break;
			case 4: gameboard[0][4] = move;
				break;
			case 5: gameboard[0][5] = move;
				break;
			case 6: gameboard[0][6] = move;
				break;
			case 7: gameboard[0][7] = move;
				break;
			case 8: gameboard[0][8] = move;
				break;
			case 9: gameboard[0][9] = move;
				break;
			case 10: gameboard[1][0] = move;
				break;
			case 11: gameboard[1][1] = move;
				break;
			case 12: gameboard[1][2] = move;
				break;
			case 13: gameboard[1][3] = move;
				break;
			case 14: gameboard[1][4] = move;
				break;
			case 15: gameboard[1][5] = move;
				break;
			case 16: gameboard[1][6] = move;
				break;
			case 17: gameboard[1][7] = move;
				break;
			case 18: gameboard[1][8] = move;
				break;
			case 19: gameboard[1][9] = move;
				break;
			case 20: gameboard[2][0] = move;
				break;
			case 21: gameboard[2][1] = move;
				break;
			case 22: gameboard[2][2] = move;
				break;
			case 23: gameboard[2][3] = move;
				break;
			case 24: gameboard[2][4] = move;
				break;
			case 25: gameboard[2][5] = move;
				break;
			case 26: gameboard[2][6] = move;
				break;
			case 27: gameboard[2][7] = move;
				break;
			case 28: gameboard[2][8] = move;
				break;
			case 29: gameboard[2][9] = move;
				break;
			case 30: gameboard[3][0] = move;
				break;
			case 31: gameboard[3][1] = move;
				break;
			case 32: gameboard[3][2] = move;
				break;
			case 33: gameboard[3][3] = move;
				break;
			case 34: gameboard[3][4] = move;
				break;
			case 35: gameboard[3][5] = move;
				break;
			case 36: gameboard[3][6] = move;
				break;
			case 37: gameboard[3][7] = move;
				break;
			case 38: gameboard[3][8] = move;
				break;
			case 39: gameboard[3][9] = move;
				break;
			case 40: gameboard[4][0] = move;
				break;
			case 41: gameboard[4][1] = move;
				break;
			case 42: gameboard[4][2] = move;
				break;
			case 43: gameboard[4][3] = move;
				break;
			case 44: gameboard[4][4] = move;
				break;
			case 45: gameboard[4][5] = move;
				break;
			case 46: gameboard[4][6] = move;
				break;
			case 47: gameboard[4][7] = move;
				break;
			case 48: gameboard[4][8] = move;
				break;
			case 49: gameboard[4][9] = move;
				break;
			case 50: gameboard[5][0] = move;
				break;
			case 51: gameboard[5][1] = move;
				break;
			case 52: gameboard[5][2] = move;
				break;
			case 53: gameboard[5][3] = move;
				break;
			case 54: gameboard[5][4] = move;
				break;
			case 55: gameboard[5][5] = move;
				break;
			case 56: gameboard[5][6] = move;
				break;
			case 57: gameboard[5][7] = move;
				break;
			case 58: gameboard[5][8] = move;
				break;
			case 59: gameboard[5][9] = move;
				break;
			case 60: gameboard[6][0] = move;
				break;
			case 61: gameboard[6][1] = move;
				break;
			case 62: gameboard[6][2] = move;
				break;
			case 63: gameboard[6][3] = move;
				break;
			case 64: gameboard[6][4] = move;
				break;
			case 65: gameboard[6][5] = move;
				break;
			case 66: gameboard[6][6] = move;
				break;
			case 67: gameboard[6][7] = move;
				break;
			case 68: gameboard[6][8] = move;
				break;
			case 69: gameboard[6][9] = move;
				break;
			case 70: gameboard[7][0] = move;
				break;
			case 71: gameboard[7][1] = move;
				break;
			case 72: gameboard[7][2] = move;
				break;
			case 73: gameboard[7][3] = move;
				break;
			case 74: gameboard[7][4] = move;
				break;
			case 75: gameboard[7][5] = move;
				break;
			case 76: gameboard[7][6] = move;
				break;
			case 77: gameboard[7][7] = move;
				break;
			case 78: gameboard[7][8] = move;
				break;
			case 79: gameboard[7][9] = move;
				break;
			case 80: gameboard[8][0] = move;
				break;
			case 81: gameboard[8][1] = move;
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
			gameboardBigBoard[0,0] == true;
		} else if(gameboard[0][1] == "X" && gameboard[1][1] == "X" && gameboard[2][1] == "X") {
			gameboardBigBoard[0,0] == true;
		} else if(gameboard[0][2] == "X" && gameboard[1][2] == "X" && gameboard[2][2] == "X") {
			gameboardBigBoard[0,0] == true;
			//Vert
		} else if(gameboard[0][0] == "X" && gameboard[0][1] == "X" && gameboard[0][2] == "X") {
			gameboardBigBoard[0,0] == true;
		} else if(gameboard[1][0] == "X" && gameboard[1][1] == "X" && gameboard[1][2] == "X") {
			gameboardBigBoard[0,0] == true;
		} else if(gameboard[2][0] == "X" && gameboard[2][1] == "X" && gameboard[2][2] == "X") {
			gameboardBigBoard[0,0] == true;
			//Diag
		} else if(gameboard[0][0] == "X" && gameboard[1][1] == "X" && gameboard[2][2] == "X") {
			gameboardBigBoard[0,0] == true;
		} else if(gameboard[0][2] == "X" && gameboard[1][1] == "X" && gameboard[2][0] == "X") {
			gameboardBigBoard[0,0] == true;
		}
	}

	public boolean winTestXTopCenter() {
		if(gameboard[3][0] == "X" && gameboard[4][0] == "X" && gameboard[5][0] == "X") {
			//set gameboardBigBoard(1,0, true)
		} else if(gameboard[3][1] == "X" && gameboard[4][1] == "X" && gameboard[5][1] == "X") {
			//set gameboardBigBoard(1,0, true)
		} else if(gameboard[3][2] == "X" && gameboard[4][2] == "X" && gameboard[5][2] == "X") {
			//set gameboardBigBoard(1,0, true)
			//Vert
		} else if(gameboard[3][0] == "X" && gameboard[3][1] == "X" && gameboard[3][2] == "X") {
			//set gameboardBigBoard(1,0, true)
		} else if(gameboard[4][0] == "X" && gameboard[4][1] == "X" && gameboard[4][2] == "X") {
			//set gameboardBigBoard(1,0, true)
		} else if(gameboard[5][0] == "X" && gameboard[5][1] == "X" && gameboard[5][2] == "X") {
			//set gameboardBigBoard(1,0, true)
			//Diag
		} else if(gameboard[3][0] == "X" && gameboard[4][1] == "X" && gameboard[5][2] == "X") {
			//set gameboardBigBoard(1,0, true)
		} else if(gameboard[3][2] == "X" && gameboard[4][1] == "X" && gameboard[5][0] == "X") {
			//set gameboardBigBoard(1,0, true)
		} else {
			winrarX = false;
		}
		return winrarX;
	}

	public boolean winTestXTopRight() {
		if(gameboard[6][0] == "X" && gameboard[7][0] == "X" && gameboard[8][0] == "X") {
			//set gameboardBigBoard(2,0, true)
		} else if(gameboard[6][1] == "X" && gameboard[7][1] == "X" && gameboard[8][1] == "X") {
			//set gameboardBigBoard(2,0, true)
		} else if(gameboard[6][2] == "X" && gameboard[7][2] == "X" && gameboard[8][2] == "X") {
			//set gameboardBigBoard(2,0, true)
			//Vert
		} else if(gameboard[6][0] == "X" && gameboard[6][1] == "X" && gameboard[6][2] == "X") {
			//set gameboardBigBoard(2,0, true)
		} else if(gameboard[7][0] == "X" && gameboard[7][1] == "X" && gameboard[7][2] == "X") {
			//set gameboardBigBoard(2,0, true)
		} else if(gameboard[8][0] == "X" && gameboard[8][1] == "X" && gameboard[8][2] == "X") {
			//set gameboardBigBoard(2,0, true)
			//Diag
		} else if(gameboard[6][0] == "X" && gameboard[7][1] == "X" && gameboard[8][2] == "X") {
			//set gameboardBigBoard(2,0, true)
		} else if(gameboard[6][2] == "X" && gameboard[7][1] == "X" && gameboard[8][0] == "X") {
			//set gameboardBigBoard(2,0, true)
		} else {
			winrarX = false;
		}
		return winrarX;
	}

	public boolean winTestXMiddleLeft() {
		if(gameboard[0][3] == "X" && gameboard[1][3] == "X" && gameboard[2][3] == "X") {
			//set gameboardBigBoard(0,1, true)
		} else if(gameboard[0][3] == "X" && gameboard[1][3] == "X" && gameboard[2][3] == "X") {
			//set gameboardBigBoard(0,1, true)
		} else if(gameboard[0][3] == "X" && gameboard[1][3] == "X" && gameboard[2][3] == "X") {
			//set gameboardBigBoard(0,1, true)
			//
		} else if(gameboard[0][3] == "X" && gameboard[0][3] == "X" && gameboard[0][3] == "X") {
			//set gameboardBigBoard(0,1, true)
		} else if(gameboard[1][3] == "X" && gameboard[1][4] == "X" && gameboard[1][5] == "X") {
			//set gameboardBigBoard(0,1, true)
		} else if(gameboard[2][3] == "X" && gameboard[2][4] == "X" && gameboard[2][5] == "X") {
			//set gameboardBigBoard(0,1, true)
			//
		} else if(gameboard[0][3] == "X" && gameboard[1][4] == "X" && gameboard[2][5] == "X") {
			//set gameboardBigBoard(0,1, true)
		} else if(gameboard[0][5] == "X" && gameboard[1][4] == "X" && gameboard[2][3] == "X") {
			//set gameboardBigBoard(0,1, true)
		} else {
			winrarX = false;
		}
		return winrarX;
	}

	public boolean winTestXMiddleCenter() {
		if(gameboard[3][3] == "X" && gameboard[4][3] == "X" && gameboard[5][3] == "X") {
			//set gameboardBigBoard(1,1, true)
		} else if(gameboard[3][4] == "X" && gameboard[4][4] == "X" && gameboard[5][4] == "X") {
			//set gameboardBigBoard(1,1, true)
		} else if(gameboard[3][5] == "X" && gameboard[4][5] == "X" && gameboard[5][5] == "X") {
			//set gameboardBigBoard(1,1, true)
			//
		} else if(gameboard[3][3] == "X" && gameboard[3][4] == "X" && gameboard[3][5] == "X") {
			//set gameboardBigBoard(1,1, true)
		} else if(gameboard[4][3] == "X" && gameboard[4][4] == "X" && gameboard[4][5] == "X") {
			//set gameboardBigBoard(1,1, true)
		} else if(gameboard[5][3] == "X" && gameboard[5][4] == "X" && gameboard[5][5] == "X") {
			//set gameboardBigBoard(1,1, true)
			//
		} else if(gameboard[3][3] == "X" && gameboard[4][4] == "X" && gameboard[5][5] == "X") {
			//set gameboardBigBoard(1,1, true)
		} else if(gameboard[3][5] == "X" && gameboard[4][4] == "X" && gameboard[5][3] == "X") {
			//set gameboardBigBoard(1,1, true)
		} else {
			winrarX = false;
		}
		return winrarX;
	}

	public boolean winTestXMiddleRight() {
		if(gameboard[6][3] == "X" && gameboard[7][3] == "X" && gameboard[8][3] == "X") {
			//set gameboardBigBoard(2,1, true)
		} else if(gameboard[6][4] == "X" && gameboard[7][4] == "X" && gameboard[8][4] == "X") {
			//set gameboardBigBoard(2,1, true)
		} else if(gameboard[6][5] == "X" && gameboard[7][5] == "X" && gameboard[8][5] == "X") {
			//set gameboardBigBoard(2,1, true)
			//
		} else if(gameboard[6][3] == "X" && gameboard[6][4] == "X" && gameboard[6][5] == "X") {
			//set gameboardBigBoard(2,1, true)
		} else if(gameboard[7][3] == "X" && gameboard[7][4] == "X" && gameboard[7][5] == "X") {
			//set gameboardBigBoard(2,1, true)
		} else if(gameboard[8][3] == "X" && gameboard[8][4] == "X" && gameboard[8][5] == "X") {
			//set gameboardBigBoard(2,1, true)
			//
		} else if(gameboard[6][3] == "X" && gameboard[7][4] == "X" && gameboard[8][5] == "X") {
			//set gameboardBigBoard(2,1, true)
		} else if(gameboard[6][5] == "X" && gameboard[7][4] == "X" && gameboard[8][3] == "X") {
			//set gameboardBigBoard(2,1, true)
		} else {
			winrarX = false;
		}
		return winrarX;
	}

	public boolean winTestXBottomLeft() {
		if(gameboard[0][6] == "X" && gameboard[1][6] == "X" && gameboard[2][6] == "X") {
			//set gameboardBigBoard(0,2, true)
		} else if(gameboard[0][7] == "X" && gameboard[1][7] == "X" && gameboard[2][7] == "X") {
			//set gameboardBigBoard(0,2, true)
		} else if(gameboard[0][8] == "X" && gameboard[1][8] == "X" && gameboard[2][8] == "X") {
			//set gameboardBigBoard(0,2, true)
			//
		} else if(gameboard[0][6] == "X" && gameboard[0][7] == "X" && gameboard[0][8] == "X") {
			//set gameboardBigBoard(0,2, true)
		} else if(gameboard[1][6] == "X" && gameboard[1][7] == "X" && gameboard[1][8] == "X") {
			//set gameboardBigBoard(0,2, true)
		} else if(gameboard[2][6] == "X" && gameboard[2][7] == "X" && gameboard[2][8] == "X") {
			//set gameboardBigBoard(0,2, true)
			//
		} else if(gameboard[0][6] == "X" && gameboard[1][7] == "X" && gameboard[2][8] == "X") {
			//set gameboardBigBoard(0,2, true)
		} else if(gameboard[0][8] == "X" && gameboard[1][7] == "X" && gameboard[2][6] == "X") {
			//set gameboardBigBoard(0,2, true)
		} else {
			winrarX = false;
		}
		return winrarX;
	}

	public boolean winTestXBottomCenter() {
		if(gameboard[3][6] == "X" && gameboard[4][6] == "X" && gameboard[5][6] == "X") {
			//set gameboardBigBoard(1,2, true)
		} else if(gameboard[3][7] == "X" && gameboard[4][7] == "X" && gameboard[5][7] == "X") {
			//set gameboardBigBoard(1,2, true)
		} else if(gameboard[3][8] == "X" && gameboard[4][8] == "X" && gameboard[5][8] == "X") {
			//set gameboardBigBoard(1,2, true)
			//
		} else if(gameboard[3][6] == "X" && gameboard[3][7] == "X" && gameboard[3][8] == "X") {
			//set gameboardBigBoard(1,2, true)
		} else if(gameboard[4][6] == "X" && gameboard[4][7] == "X" && gameboard[4][8] == "X") {
			//set gameboardBigBoard(1,2, true)
		} else if(gameboard[5][6] == "X" && gameboard[5][7] == "X" && gameboard[5][8] == "X") {
			//set gameboardBigBoard(1,2, true)
			//
		} else if(gameboard[3][6] == "X" && gameboard[4][7] == "X" && gameboard[5][8] == "X") {
			//set gameboardBigBoard(1,2, true)
		} else if(gameboard[3][8] == "X" && gameboard[4][7] == "X" && gameboard[5][6] == "X") {
			//set gameboardBigBoard(1,2, true)
		} else {
			winrarX = false;
		}
		return winrarX;
	}

	public boolean winTestXBottomRight() {
		if(gameboard[6][6] == "X" && gameboard[7][6] == "X" && gameboard[8][6] == "X") {
			//set gameboardBigBoard(2,2, true)
		} else if(gameboard[6][7] == "X" && gameboard[7][7] == "X" && gameboard[8][7] == "X") {
			//set gameboardBigBoard(2,2, true)
		} else if(gameboard[6][8] == "X" && gameboard[7][8] == "X" && gameboard[8][8] == "X") {
			//set gameboardBigBoard(2,2, true)
			//
		} else if(gameboard[6][6] == "X" && gameboard[6][7] == "X" && gameboard[6][8] == "X") {
			//set gameboardBigBoard(2,2, true)
		} else if(gameboard[7][6] == "X" && gameboard[7][7] == "X" && gameboard[7][8] == "X") {
			//set gameboardBigBoard(2,2, true)
		} else if(gameboard[8][6] == "X" && gameboard[8][7] == "X" && gameboard[8][8] == "X") {
			//set gameboardBigBoard(2,2, true)
			//
		} else if(gameboard[6][6] == "X" && gameboard[7][7] == "X" && gameboard[8][8] == "X") {
			//set gameboardBigBoard(2,2, true)
		} else if(gameboard[6][8] == "X" && gameboard[7][7] == "X" && gameboard[8][6] == "X") {
			//set gameboardBigBoard(2,2, true)
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
			//Vert
		} else if(gameboard[0][0] == "O" && gameboard[0][1] == "O" && gameboard[0][2] == "O") {
			winrarO = true;
		} else if(gameboard[1][0] == "O" && gameboard[1][1] == "O" && gameboard[1][2] == "O") {
			winrarO = true;
		} else if(gameboard[2][0] == "O" && gameboard[2][1] == "O" && gameboard[2][2] == "O") {
			winrarO = true;
			//Diag
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
		if(gameboard[3][0] == "O" && gameboard[4][0] == "O" && gameboard[5][0] == "O") {
			winrarO = true;
		} else if(gameboard[3][1] == "O" && gameboard[4][1] == "O" && gameboard[5][1] == "O") {
			winrarO = true;
		} else if(gameboard[3][2] == "O" && gameboard[4][2] == "O" && gameboard[5][2] == "O") {
			winrarO = true;
			//Vert
		} else if(gameboard[3][0] == "O" && gameboard[3][1] == "O" && gameboard[3][2] == "O") {
			winrarO = true;
		} else if(gameboard[4][0] == "O" && gameboard[4][1] == "O" && gameboard[4][2] == "O") {
			winrarO = true;
		} else if(gameboard[5][0] == "O" && gameboard[5][1] == "O" && gameboard[5][2] == "O") {
			winrarO = true;
			//Diag
		} else if(gameboard[3][0] == "O" && gameboard[4][1] == "O" && gameboard[5][2] == "O") {
			winrarO = true;
		} else if(gameboard[3][2] == "O" && gameboard[4][1] == "O" && gameboard[5][0] == "O") {
			winrarO = true;
		} else {
			winrarO = false;
		}
		return winrarO;
	}

	public boolean winTestOTopRight() {
		if(gameboard[6][0] == "O" && gameboard[7][0] == "O" && gameboard[8][0] == "O") {
			winrarO = true;
		} else if(gameboard[6][1] == "O" && gameboard[7][1] == "O" && gameboard[8][1] == "O") {
			winrarO = true;
		} else if(gameboard[6][2] == "O" && gameboard[7][2] == "O" && gameboard[8][2] == "O") {
			winrarO = true;
			//Vert
		} else if(gameboard[6][0] == "O" && gameboard[6][1] == "O" && gameboard[6][2] == "O") {
			winrarO = true;
		} else if(gameboard[7][0] == "O" && gameboard[7][1] == "O" && gameboard[7][2] == "O") {
			winrarO = true;
		} else if(gameboard[8][0] == "O" && gameboard[8][1] == "O" && gameboard[8][2] == "O") {
			winrarO = true;
			//Diag
		} else if(gameboard[6][0] == "O" && gameboard[7][1] == "O" && gameboard[8][2] == "O") {
			winrarO = true;
		} else if(gameboard[6][2] == "O" && gameboard[7][1] == "O" && gameboard[8][0] == "O") {
			winrarO = true;
		} else {
			winrarO = false;
		}
		return winrarO;
	}

	public boolean winTestOMiddleLeft() {
		if(gameboard[0][3] == "O" && gameboard[1][3] == "O" && gameboard[2][3] == "O") {
			winrarO = true;
		} else if(gameboard[0][3] == "O" && gameboard[1][3] == "O" && gameboard[2][3] == "O") {
			winrarO = true;
		} else if(gameboard[0][3] == "O" && gameboard[1][3] == "O" && gameboard[2][3] == "O") {
			winrarO = true;
			//
		} else if(gameboard[0][3] == "O" && gameboard[0][3] == "O" && gameboard[0][3] == "O") {
			winrarO = true;
		} else if(gameboard[1][3] == "O" && gameboard[1][4] == "O" && gameboard[1][5] == "O") {
			winrarO = true;
		} else if(gameboard[2][3] == "O" && gameboard[2][4] == "O" && gameboard[2][5] == "O") {
			winrarO = true;
			//
		} else if(gameboard[0][3] == "O" && gameboard[1][4] == "O" && gameboard[2][5] == "O") {
			winrarO = true;
		} else if(gameboard[0][5] == "O" && gameboard[1][4] == "O" && gameboard[2][3] == "O") {
			winrarO = true;
		} else {
			winrarO = false;
		}
		return winrarO;
	}

	public boolean winTestOMiddleCenter() {
		if(gameboard[3][3] == "O" && gameboard[4][3] == "O" && gameboard[5][3] == "O") {
			winrarO = true;
		} else if(gameboard[3][4] == "O" && gameboard[4][4] == "O" && gameboard[5][4] == "O") {
			winrarO = true;
		} else if(gameboard[3][5] == "O" && gameboard[4][5] == "O" && gameboard[5][5] == "O") {
			winrarO = true;
			//
		} else if(gameboard[3][3] == "O" && gameboard[3][4] == "O" && gameboard[3][5] == "O") {
			winrarO = true;
		} else if(gameboard[4][3] == "O" && gameboard[4][4] == "O" && gameboard[4][5] == "O") {
			winrarO = true;
		} else if(gameboard[5][3] == "O" && gameboard[5][4] == "O" && gameboard[5][5] == "O") {
			winrarO = true;
			//
		} else if(gameboard[3][3] == "O" && gameboard[4][4] == "O" && gameboard[5][5] == "O") {
			winrarO = true;
		} else if(gameboard[3][5] == "O" && gameboard[4][4] == "O" && gameboard[5][3] == "O") {
			winrarO = true;
		} else {
			winrarO = false;
		}
		return winrarO;
	}

	public boolean winTestOMiddleRight() {
		if(gameboard[6][3] == "O" && gameboard[7][3] == "O" && gameboard[8][3] == "O") {
			winrarO = true;
		} else if(gameboard[6][4] == "O" && gameboard[7][4] == "O" && gameboard[8][4] == "O") {
			winrarO = true;
		} else if(gameboard[6][5] == "O" && gameboard[7][5] == "O" && gameboard[8][5] == "O") {
			winrarO = true;
			//
		} else if(gameboard[6][3] == "O" && gameboard[6][4] == "O" && gameboard[6][5] == "O") {
			winrarO = true;
		} else if(gameboard[7][3] == "O" && gameboard[7][4] == "O" && gameboard[7][5] == "O") {
			winrarO = true;
		} else if(gameboard[8][3] == "O" && gameboard[8][4] == "O" && gameboard[8][5] == "O") {
			winrarO = true;
			//
		} else if(gameboard[6][3] == "O" && gameboard[7][4] == "O" && gameboard[8][5] == "O") {
			winrarO = true;
		} else if(gameboard[6][5] == "O" && gameboard[7][4] == "O" && gameboard[8][3] == "O") {
			winrarO = true;
		} else {
			winrarO = false;
		}
		return winrarO;
	}

	public boolean winTestOBottomLeft() {
		if(gameboard[0][6] == "O" && gameboard[1][6] == "O" && gameboard[2][6] == "O") {
			winrarO = true;
		} else if(gameboard[0][7] == "O" && gameboard[1][7] == "O" && gameboard[2][7] == "O") {
			winrarO = true;
		} else if(gameboard[0][8] == "O" && gameboard[1][8] == "O" && gameboard[2][8] == "O") {
			winrarO = true;
			//
		} else if(gameboard[0][6] == "O" && gameboard[0][7] == "O" && gameboard[0][8] == "O") {
			winrarO = true;
		} else if(gameboard[1][6] == "O" && gameboard[1][7] == "O" && gameboard[1][8] == "O") {
			winrarO = true;
		} else if(gameboard[2][6] == "O" && gameboard[2][7] == "O" && gameboard[2][8] == "O") {
			winrarO = true;
			//
		} else if(gameboard[0][6] == "O" && gameboard[1][7] == "O" && gameboard[2][8] == "O") {
			winrarO = true;
		} else if(gameboard[0][8] == "O" && gameboard[1][7] == "O" && gameboard[2][6] == "O") {
			winrarO = true;
		} else {
			winrarO = false;
		}
		return winrarO;
	}

	public boolean winTestOBottomCenter() {
		if(gameboard[3][6] == "O" && gameboard[4][6] == "O" && gameboard[5][6] == "O") {
			winrarO = true;
		} else if(gameboard[3][7] == "O" && gameboard[4][7] == "O" && gameboard[5][7] == "O") {
			winrarO = true;
		} else if(gameboard[3][8] == "O" && gameboard[4][8] == "O" && gameboard[5][8] == "O") {
			winrarO = true;
			//
		} else if(gameboard[3][6] == "O" && gameboard[3][7] == "O" && gameboard[3][8] == "O") {
			winrarO = true;
		} else if(gameboard[4][6] == "O" && gameboard[4][7] == "O" && gameboard[4][8] == "O") {
			winrarO = true;
		} else if(gameboard[5][6] == "O" && gameboard[5][7] == "O" && gameboard[5][8] == "O") {
			winrarO = true;
			//
		} else if(gameboard[3][6] == "O" && gameboard[4][7] == "O" && gameboard[5][8] == "O") {
			winrarO = true;
		} else if(gameboard[3][8] == "O" && gameboard[4][7] == "O" && gameboard[5][6] == "O") {
			winrarO = true;
		} else {
			winrarO = false;
		}
		return winrarO;
	}

	public boolean winTestOBottomRight() {
		if(gameboard[6][6] == "O" && gameboard[7][6] == "O" && gameboard[8][6] == "O") {
			winrarO = true;
		} else if(gameboard[6][7] == "O" && gameboard[7][7] == "O" && gameboard[8][7] == "O") {
			winrarO = true;
		} else if(gameboard[6][8] == "O" && gameboard[7][8] == "O" && gameboard[8][8] == "O") {
			winrarO = true;
			//
		} else if(gameboard[6][6] == "O" && gameboard[6][7] == "O" && gameboard[6][8] == "O") {
			winrarO = true;
		} else if(gameboard[7][6] == "O" && gameboard[7][7] == "O" && gameboard[7][8] == "O") {
			winrarO = true;
		} else if(gameboard[8][6] == "O" && gameboard[8][7] == "O" && gameboard[8][8] == "O") {
			winrarO = true;
			//
		} else if(gameboard[6][6] == "O" && gameboard[7][7] == "O" && gameboard[8][8] == "O") {
			winrarO = true;
		} else if(gameboard[6][8] == "O" && gameboard[7][7] == "O" && gameboard[8][6] == "O") {
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

//WE NEED TO FIX THIS
		if(!winTestXBigBoard()) {
			wintestX = true;
		}

		if(!winTestOBigBoard()) {
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
