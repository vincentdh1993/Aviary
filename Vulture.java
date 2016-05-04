import java.awt.Color;
import java.awt.Point;

public class Vulture extends AbstractBird implements Bird { 
	private int d=0; //this d stands for direction, which will be movements for the vulture.
	
	public Vulture(int x, int y) { //taking same parameters as the superclass.
		super(x,y);
		color = Color.black; //vulture has black color.
	}

	public void fly() {
				if(d==0){ //if d is equal 0, the original position, it moves up.
					position.y--;
				}else if(d==1){ //If d is 1, it moves to left.
					position.x--;
				}else if(d==2){ //if d is 2, it moves to down.
					position.y++;
				}else{ //else, which will be 3, it will move to right.
					position.x++;
				}
				d++; //adding d.
				d %=4; //this will reset the bird after finishing the circle.
			}
	}

