import java.awt.Color;

public class Turtle {
	private double x, y;
	private double angle;

	public Turtle(double x0, double y0, double a0) {
		x = x0;
		y = y0;
		angle = a0;
	}
	public void setPosition(double newx, double newy) {
		x = newx;
		y = newy;
	}
	public double[] getPosition() {
		double[] a = {x,y};
		return a;
	}
	public void setAngle(double newAngle) {
		angle = newAngle;
	}
	public double getAngle() {
		return angle;
	}

	public void show() {
		StdDraw.show();
	}
	public void setColor(Color color) {
        StdDraw.setPenColor(color);
	}
	public void setSize(double radius) {
		StdDraw.setPenRadius(radius);
	}

	public void left(double delta) {
		angle += delta;
	}
	public void right(double delta) {
		angle -= delta;
	}

	public void forward(double step) {
		double newx = x + step * Math.cos(Math.toRadians(angle));
		double newy = y + step * Math.sin(Math.toRadians(angle));
		StdDraw.line(x, y, newx, newy);
		setPosition(newx, newy);
		show();
	}
	public void backward(double step) {
		double newx = x - step * Math.cos(Math.toRadians(angle));
		double newy = y - step * Math.sin(Math.toRadians(angle));
		StdDraw.line(x, y, newx, newy);
		setPosition(newx, newy);
		show();
	}
	public void hexagon(double sideLength) {
		for (int i = 0; i < 6; i++) {
			right(60);
			forward(sideLength);
		}
	}

}


