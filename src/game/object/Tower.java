package game.object;
import games.basic.gameObjects.moveable.AbstactStationaryGameObject;
import games.basic.position.interfaces.Positionable;

import java.awt.Graphics;

import game.special.*;

public abstract class Tower extends AbstactStationaryGameObject{
	protected int towerDmg;
	protected int towerRange;
	protected int towerSpeed;
	protected Type typ;
	protected int cost;

	public Tower(Positionable pos, Positionable deltaPos) {
		super(pos, deltaPos);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void paintComponent(Graphics g) {
		
	}
	
	public int getTowerDmg() {
		return towerDmg;
	}

	public void setTowerDmg(int towerDmg) {
		this.towerDmg = towerDmg;
	}

	public int getTowerRange() {
		return towerRange;
	}

	public void setTowerRange(int towerRange) {
		this.towerRange = towerRange;
	}

	public int getTowerSpeed() {
		return towerSpeed;
	}

	public void setTowerSpeed(int towerSpeed) {
		this.towerSpeed = towerSpeed;
	}

	public Type getTyp() {
		return typ;
	}

	public void setTyp(Type typ) {
		this.typ = typ;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}	
}
