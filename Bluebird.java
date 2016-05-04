import java.awt.Color;
import java.awt.Point;

public class Bluebird extends AbstractBird implements Bird {
	private int directions = 0;  //Define directions as 0 which will allow change the position.
	private int route = 1; //The initial move to right.
	
	public Bluebird(int x, int y) { //taking same parameters as the super class.
		super(x,y);
		color = Color.blue; //bluebird has blue color.
	}

	public void fly() {
				if(position.x == 0 || position.x == SIZE-1){ //checks the bird if it is in the area and if not,
					route *= -1;								//it changes the route by multiplying -1.
				}
				position.x += route; //make the bird to move right.
				if (directions == 0) { 
					position.y -= 1;//move the bird one up.
					directions = 1; //reset the directions to 1 for next move.
				} else {
					position.y += 1; //move the bird one down.
					directions = 0; //reset the directions to 0 so it can move up again.
				}
				
	}

}