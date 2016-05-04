import java.awt.Color;
import java.awt.Point;

public class Cardinal extends AbstractBird implements Bird { //Cardinal takes inheritance from the AbstarctBird class while using interface of Bird Class.
	private int direction = -1; //According to Hint2, negative number in y direction makes the bird going up. Initializing the direction first.
	
	public Cardinal(int x, int y){
		super(x,y); //taking same form as the super class, AbstractBird
		color = Color.red; //setting color to red.
	}
	
	public void fly(){ //Overriding unique fly of Cardinal.
		if(position.y == 0 || position.y == SIZE - 1){ //this if statement checks for the direction of the bird. If the bird hits the maximum size,
			direction *= -1; //multiply -1 to the direction so it would change the direction.
		}
		position.y += direction; //the y coord. would keep decrease or increase until it hits the maximum area.
	}
}
	


