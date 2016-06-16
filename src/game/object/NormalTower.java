package game.object;

import games.basic.position.interfaces.Positionable;

import java.awt.Color;
import java.awt.Graphics;

import game.special.*;


public class NormalTower extends Tower{

	public NormalTower(Positionable pos, Positionable deltaPos) {
		super(pos, deltaPos);
		this.towerDmg = 100;
		this.towerRange = 50;
		this.towerSpeed = 100;
		this.typ = new Normal();
		this.cost = 100;
	}	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(new Color(230,230,230));
		g.drawRect(this.getPos().getX(), this.getPos().getY(), 20, 20);
		g.setColor(new Color(230,100,200));
		g.drawOval(this.getPos().getX()+5, this.getPos().getY()+5, 10, 10);
	}

}
