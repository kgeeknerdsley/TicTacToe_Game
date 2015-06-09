package com.game.ttt;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Button extends JButton {
	GameCalcs calc = new GameCalcs();

	boolean isPressed;
	int ident;

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

	public boolean isPressed() {
		return isPressed;
	}

	public void setPress(boolean state) {
		isPressed = state;
	}

	public void loadXIcon() {
		try {
			xTemp = ImageIO.read(new File("X.png"));
		} catch (IOException e) {
			System.out.println("Error loading the X icon.");
		}

		xIcon = new ImageIcon(xTemp);
	}

	public void loadOIcon() {
		try {
			oTemp = ImageIO.read(new File("O.png"));
		} catch (IOException e) {
			System.out.println("Error loading the O icon.");
		}

		oIcon = new ImageIcon(oTemp);
	}

	public void setX() {
		setText("X");
		setPress(true);
		setIcon(xIcon);
	}

	public void setO() {
		setText("O");
		setPress(true);
		setIcon(oIcon);
	}

	public int getID() {
		return ident;
	}
}
