/* 
 * Created by Aaron Macneill 01/02/2018
 * 
*/
import java.awt.Color;

public class Turtle {
	private double x, y; //turtles position
	private double angle; //turtles angle

	public Turtle(double x0, double y0, double a0) { //constructor needs y, x positions and an angle
		x = x0;
		y = y0;
		angle = a0;
	}
	public void setPosition(double newx, double newy) { //set turtles position
		x = newx;
		y = newy;
	}
	public double[] getPosition() { //get turtles position
		double[] a = {x,y};
		return a;
	}
	public void setAngle(double newAngle) { // set turtle angle
		angle = newAngle;
	}
	public double getAngle() { //get turtle angle
		return angle;
	}

	public void show() { //display the turtle
		StdDraw.show();
	}
	public void setColor(Color color) { //set turtle pen color
        StdDraw.setPenColor(color);
	}
	public void setSize(double radius) { //set pen radius
		StdDraw.setPenRadius(radius);
	}

	//MOVEMENT

	public void left(double delta) { //turn left
		angle += delta;
	}
	public void right(double delta) { //turn right
		angle -= delta;
	}

	public void forward(double step) { //move forward
		double newx = x + step * Math.cos(Math.toRadians(angle));
		double newy = y + step * Math.sin(Math.toRadians(angle));
		StdDraw.line(x, y, newx, newy);
		setPosition(newx, newy);
		show();
	}
	public void backward(double step) { //move backward
		double newx = x - step * Math.cos(Math.toRadians(angle));
		double newy = y - step * Math.sin(Math.toRadians(angle));
		StdDraw.line(x, y, newx, newy);
		setPosition(newx, newy);
		show();
	}
	//SHAPES
	public void hexagon(double sideLength) { //draw a hexagon
		for (int i = 0; i < 6; i++) {
			right(60);
			forward(sideLength);
		}
	}

}


