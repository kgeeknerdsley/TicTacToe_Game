package com.game.ttt;

import java.util.Random;

public class GameCalcs {
	Random randgen = new Random();

	String gameboard[][];
	
	//unused, should remove soon
	Boolean winrar = new Boolean(null);
	Boolean winrarX = new Boolean(null);
	Boolean winrarO = new Boolean(null);

	Integer rowNum = new Integer(0);
	Integer colNum = new Integer(0);

	//constructor creates gameboard
	public GameCalcs() {
		gameboard = new String[3][3];
	}

	//updates gameboard with proper move and position
	public void boardUpdate(int identifier, String move) {
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

	//translates row/col 
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

	//ai RECURSIVE logic for deciding new spot to move
	public int aiRandMove() {
		int row = randomMove();
		int col = randomMove();
		
		if(gameboard[row][col] == null) {
			return buttonTranslator(row, col);
		} else {
			 return aiRandMove();
		}		
	}

	//getter for row, delete
	public int getRow() {
		return rowNum;
	}

	//getter for column, delete
	public int getCol() {
		return colNum;
	}
	
	//random number gen
	public int randomMove() {
		int num = randgen.nextInt(3);
		return num;
	}

	//tests for X win
	public boolean winTestX() {
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

	//tests for O win
	public boolean winTestO() {
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

	//obsolete, remove later
	public int buttonTally() {
		int buttally = 0;

		buttally++;

		return buttally;
	}
	
	//tests for game tie
	public boolean tieTest() {
		int fillcount = 0;
		boolean nulltest = false; // returns true if the test passes (no null values)
		boolean wintestX = false;
		boolean wintestO = false;

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

	//dev method, remove later
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
