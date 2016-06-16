package game.mapLogic;

import java.util.HashMap;

import javax.swing.JComponent;

import game.object.Box;
import games.basic.position.Position;

public class GameMap extends JComponent{

	private HashMap<Position, Box> gameBoxPositions;
	private GameMapGenerator gameMapGenerator;
	
	public GameMap () {
		this.gameBoxPositions = new HashMap();
		this.gameMapGenerator = new GameMapGenerator();
	}
}
