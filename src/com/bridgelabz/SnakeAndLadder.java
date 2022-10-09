package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
	
	static int position = 0;
	
	static int diceRoll() {
		int diceRoll = (int)(Math.random()*10)%6 + 1;
		return diceRoll;
	}
	
	public static void main(String[] Args) {
	int diceRoll = diceRoll();	
	
	}

}

