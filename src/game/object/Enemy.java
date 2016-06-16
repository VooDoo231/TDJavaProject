package game.object;

import game.special.Type;
import games.basic.gameObjects.moveable.AbstractMoveableGameObject;
import games.basic.position.interfaces.Positionable;

public abstract class Enemy extends AbstractMoveableGameObject{

	protected String name;
	protected int nr;
	protected Type typ;	
	
	public Enemy(Positionable pos, Positionable deltaPos) {
		super(pos, deltaPos);
		// TODO Auto-generated constructor stub
	}
	 
}
