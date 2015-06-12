package com.game.ttt;

import java.util.*;

public class AIBrain {
	Random rgen = new Random();

	//empty constructor
	public AIBrain() {
	}
	
	//speech on ai start
	public String introSpeak() {
		return "AI is active. I will play as O. I will begin after you move.";
	}
	
	//things ai says on player move, nice version
	public String moveSpeakNice() {
		String[] nicesents = new String[]{"Good choice!", "Not a bad idea!", "Nice move!", "You're doing great!", "True genius..."};
		int snum = rgen.nextInt(nicesents.length);
		return nicesents[snum];
	}
	
	//things ai says on player move, snarky version
	public String moveSpeakSnarky() {
		String[] movesents = new String[]{"Interesting move...", "I'm not sure I would have done that.", "Such a strange strategy.", "Have you ever played this game before?", "I can tell you're new to this.", "Were you raised in a barn?", "Are you sure you don't need mental help?", "Kevin, stop playing.", "I have observed free-floating bacteria have make moves more well thought out than that one.", "That move is confirmation that your species is doomed for extinction.", "That move made me experience depression for the first time, and I'm a computer.", "Would your mother be proud of that move?", "But what move would Jesus have made?", "Ihre Mutter ist eine Melone und Umzug machte ihr Bedauern mit Ihnen."};

		int snum = rgen.nextInt(movesents.length);
		return movesents[snum];
	}
}
