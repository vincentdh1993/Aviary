import java.awt.Color;
import java.awt.Point;

public class Hummingbird extends AbstractBird implements Bird { //Hummingbird takes inheritance from the AbstarctBird class while using interface of Bird Class.
	
	public Hummingbird(int x, int y) { //taking same parameters as the AbstracBird, the superclass.
		super(x,y);
		color = Color.magenta; //setting color to magenta.
	}

	public void fly() { //Unique fly method for the Hummingbird.
		position = new Point((int) (Math.random()*(SIZE - 1)), (int) (Math.random()*(SIZE - 1))); //by using random, it set positions of bird in random places.
	}

}
