package game.main;

import java.util.Random;

import game.mapLogic.GameMapGenerator;

public class Main {
	
	public static void main(String args[]) {
		MyPanel pan = new MyPanel();
		int randomSeed = 1000;
		Random randomGen = new Random();
		int randomInt;
		while(true) {
			randomInt = randomGen.nextInt(randomSeed);
			System.out.println(randomInt);
		}
	}
}
