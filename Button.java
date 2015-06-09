package com.game.ttt;

import javax.swing.*;

public class Button extends JButton {
	GameCalcs calc = new GameCalcs();


	boolean isPressed;
	int ident;

	public Button(int identifier) {
		super();
		isPressed = false;
		ident = identifier;
	}

	public boolean isPressed() {
		return isPressed;
	}

	public void setPress(boolean state) {
		isPressed = state;
	}

	public void setX() {
		setText("X");
		setPress(true);
	}

	public void setO() {
		setText("O");
		setPress(true);
	}

	public int getID() {
		return ident;
	}
}
