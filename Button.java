package com.game.ttt;

//lots o' imports
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Button extends JButton {
	GameCalcs calc = new GameCalcs();

	boolean isPressed; //boolean if button was pressed or not
	int ident; //identifier for button #

	//all icon instantiation stuff
	BufferedImage xTemp = null;
	BufferedImage oTemp = null;

	ImageIcon xIcon;
	ImageIcon oIcon;

	public Button(int identifier) {
		super();
		isPressed = false;
		ident = identifier;
		loadXIcon();
		loadOIcon();
	}

	//returns press state
	public boolean isPressed() {
		return isPressed;
	}

	//sets press state
	public void setPress(boolean state) {
		isPressed = state;
	}

	//loads the x icon
	public void loadXIcon() {
		try {
			xTemp = ImageIO.read(new File("X.png"));
		} catch (IOException e) {
			System.out.println("Error loading the X icon.");
		}

		xIcon = new ImageIcon(xTemp);
	}

	//loads the o icon
	public void loadOIcon() {
		try {
			oTemp = ImageIO.read(new File("O.png"));
		} catch (IOException e) {
			System.out.println("Error loading the O icon.");
		}

		oIcon = new ImageIcon(oTemp);
	}

	//sets the button to x
	public void setX() {
		//setText("X");
		setPress(true);
		setIcon(xIcon);
	}

	//sets the button to o
	public void setO() {
		//setText("O");
		setPress(true);
		setIcon(oIcon);
	}

	//gets actual button number
	public int getID() {
		return ident;
	}
}
