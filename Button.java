package com.game.ttt;

import javax.swing.JButton;

public class Button extends JButton {
	boolean isPressed;
	
	public Button() {
		super();
		isPressed = false;
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
}
