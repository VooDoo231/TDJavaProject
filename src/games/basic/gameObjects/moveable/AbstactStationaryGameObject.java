package games.basic.gameObjects.moveable;

import games.basic.gameObjects.AbstractGameObject;
import games.basic.gameObjects.interfaces.Stationary;
import games.basic.position.interfaces.Positionable;

public class AbstactStationaryGameObject extends AbstractGameObject implements Stationary{
	
	private Positionable deltaPos;
	
	public AbstactStationaryGameObject(Positionable pos, Positionable deltaPos) {
		super(pos);
		this.setDeltaPos(deltaPos);
	}
	
	@Override
	public Positionable getDeltaPos() {
		return this.deltaPos;
	}

	@Override
	public void setDeltaPos(Positionable deltaPos) {
		this.deltaPos = deltaPos;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void place() {
		int newX = this.getDeltaPos().getX();
		int newY = this.getDeltaPos().getY();
		this.setPos(newX, newY);		
	}


}
