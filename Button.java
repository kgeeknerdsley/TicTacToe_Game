package com.game.ttt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Button extends JButton {
	GameCalcs calc = new GameCalcs();
	DialogBoxes dialog = new DialogBoxes();

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
	}

	public void setO() {
		setText("O");
	}

	public void pressedX() {
		calc.boardUpdateX(ident);
		setX();
	}

	public void pressedO() {
		calc.boardUpdateO(ident);
		setO();
	}
}
