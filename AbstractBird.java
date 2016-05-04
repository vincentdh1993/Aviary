import java.awt.*;

public abstract class AbstractBird implements AviaryConstants{ //Creating Abstract Class to hold the common behaviors.
	Point position;
	Color color;
	

	public AbstractBird(int x, int y) { //set a new position by using Point class to int x and int y.
		position = new Point(x, y);
	}

	public Point getPosition(){ //using the Point class, return the Positions.
		return position;
	}
	
	
	public Color getColor(){ //Returning the color of birds.
		return color;
	}
}
