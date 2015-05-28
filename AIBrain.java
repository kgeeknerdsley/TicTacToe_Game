package com.game.ttt;

import java.util.*;

public class AIBrain {
	Random rgen = new Random();

	public AIBrain() {
	}

	public String introSpeak() {
		return "I am TTTBot, hello there. Make the first move, please.";
	}
	
	public String moveSpeak() {
		String[] movesents = new String[]{"Interesting move...", "I'm not sure I would have done that.", "Such a strange strategy.", "Have you ever played this game before?", "I can tell you're new to this."};
		
		int snum = rgen.nextInt(movesents.length);
		return movesents[snum];
	}
}
