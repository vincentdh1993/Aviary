import java.awt.Color;
import java.awt.Point;

public interface Bird { //Bird Class which contains color, position, and how they fly.
	
	public Color getColor(); //Using COlor class.
	
	public Point getPosition(); //Using Point class
	
	public void fly(); //since it does not return anything, it remains at void.
}
