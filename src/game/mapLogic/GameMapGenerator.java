package game.mapLogic;

import java.util.Random;

public class GameMapGenerator {
	private int randomSeed;
	private Random randomGen;
	private int randomInt;
	
	public GameMapGenerator() {
		randomSeed = 1000;
		randomGen = new Random();
		randomInt = randomGen.nextInt(randomSeed);
		
	}

	public int getRandomInt() {
		return randomInt;
	}
}
