package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
	
	static int position = 0;
	static final int NO_PLAY = 0;
	static final int LADDER = 1;
	static final int SNAKE = 2;
	public static int diceRoll() {
		return (int)(Math.random()*10)%6 + 1;
		
	}
	public static void optionCheck(int dice) {
		Random random = new Random();
		int option = random.nextInt(3);
		switch (option) {
		case LADDER :
			System.out.println("LADDER");
			position =position + dice;
			break;
		case SNAKE :
			System.out.println("SNAKE");
			position =position - dice;
			break;
		case NO_PLAY :
			System.out.println("NO_PLAY");
			position=position;
		}
		if (position<=0)
			position=0;
		if (position > 100)
			position = position - dice;
		
	}
	

	public static void main(String[] args) {
		int count = 0;
		do {
		int dice = diceRoll();
		count++;
		System.out.println("dice= "+dice);
		optionCheck(dice);
		System.out.println("position = "+position);
		} while(position != 100);
		System.out.println("Number of times dice was played : "+count);
	}
}

