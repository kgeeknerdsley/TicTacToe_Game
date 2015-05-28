package com.game.ttt;

import java.util.*;

public class AIBrain {
	Random rgen = new Random();

	public AIBrain() {
	}

	public String introSpeak() {
		return "AI is active. I will play as O. I will begin after you move.";
	}
	
	public String moveSpeakNice() {
		String[] nicesents = new String[]{"Good choice!", "Not a bad idea!", "Nice move!", "You're doing great!", "True genius..."};
		int snum = rgen.nextInt(nicesents.length);
		return nicesents[snum];
	}
	
	public String moveSpeakSnarky() {
		String[] movesents = new String[]{"Interesting move...", "I'm not sure I would have done that.", "Such a strange strategy.", "Have you ever played this game before?", "I can tell you're new to this.", "Were you raised in a barn?", "Are you sure you don't need mental help?", "Kevin, stop playing.", "I have observed free-floating bacteria have make moves more well thought out than that one.", "That move is confirmation that your species is doomed for extinction.", "That move made me experience depression for the first time, and I'm a computer.", "Would your mother be proud of that move?", "But what move would Jesus have made?", "Ihre Mutter ist eine Melone und Umzug machte ihr Bedauern mit Ihnen."};

		int snum = rgen.nextInt(movesents.length);
		return movesents[snum];
	}
	
	public String endSpeakNice() {
		String[] niceends = new String[]{"Well done!", "I knew you could do it!", "Excellent job!"};
		
		int snum = rgen.nextInt(niceends.length);
		return niceends[snum];
	}
	
	public String endSpeakSnark() {
		String[] snarkends = new String[]{"I only lost to save you your pride.", "I let you win.", "General jerk sentences."};
		
		int snum = rgen.nextInt(snarkends.length);
		return snarkends[snum];
	}
}
