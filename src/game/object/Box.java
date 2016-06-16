package game.object;

import java.awt.Graphics;

import games.basic.gameObjects.moveable.AbstactStationaryGameObject;
import games.basic.position.interfaces.Positionable;

public abstract class Box extends AbstactStationaryGameObject{
	
	protected int sizeX, sizeY;
	protected int posX, posY;
	protected String name;
	protected int nr;
	protected boolean up;
	
	public Box(Positionable pos, Positionable deltaPos) {
		super(pos, deltaPos);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void paintComponent(Graphics g) {
		
	}
}
