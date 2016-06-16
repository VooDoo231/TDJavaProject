package games.basic.gameObjects;
import games.basic.position.interfaces.Positionable;


public class CircularGameObject extends AbstractGameObject {

	private int radius;
	
	// Konstruktor
	// Beachte: Parameter Positionable 'pos' fehlte im Aufgabenblatt
	public CircularGameObject(Positionable pos, int radius) {
		// Beachte: jetzt nicht this.pos setzen, sondern super.pos !
		super(pos);		// Aufruf: AbstractGameObject(pos);
		this.radius = radius;
	}
	
	
	@Override
	public int getWidth() {
		return this.radius;
	}

	@Override
	public int getHeight() {
		return this.radius;
	}

	
	public String toString() {
		// verwende toString-Methode aus Positionable
		return ("pos = " + this.getPos()
				+ ", radius = " + this.radius + ")");
	}
	
	public boolean equals(Object other) {
		if (other == null || !(other instanceof CircularGameObject))
			return false;
		
		CircularGameObject otherCirc = (CircularGameObject)other;
			// Beachte: this.pos funktioniert nicht, da Attribut pos in Oberklasse private ist!
			//		    --> getPos() funktioniert, egal ob Attribut pos hier oder in Oberklasse 
			//		  	 	definiert ist
		Positionable thisPos  = this.getPos();
		Positionable otherPos = otherCirc.getPos();
		
		return  // vergleiche aktuelle Position
				//		verwende equals-Methode von Positionable
				thisPos.equals( otherPos )
				// vergleiche Breite/Höhe
				&& this.radius == otherCirc.radius;
	}

}
