package games.basic.gameObjects.interfaces;
import games.basic.position.interfaces.Positionable;

public interface Stationary {
	
	void place();
	
	void setDeltaPos(Positionable deltaPos);
	Positionable getDeltaPos();

}
