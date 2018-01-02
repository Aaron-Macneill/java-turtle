import java.util.Scanner;

class CubeDemo {
	public static void main(String[] args) {
		double size = 0.1;
		double a0 = 90;
		Turtle t = new Turtle(0.3,0.3,a0); //set t as turtle
		drawCube(t, size);
		System.out.println("Draw another to the:\n8: top\n2: bottom\n4: left\n6: right");
		Scanner input = new Scanner(System.in);
		while(true) { //loop to move turtle according to user input
			int cmd = input.nextInt();
			switch(cmd) {
				case 8: drawCubeDirection(t, size, a0, "up");
					break;

				case 2: drawCubeDirection(t, size, a0, "down");
					break;

				case 4: drawCubeDirection(t, size, a0, "left");
					break;

				case 6: drawCubeDirection(t, size, a0, "right");
					break;
			}
		}
	}

	public static void drawCube(Turtle t, double side) { //function to draw a cube
		double a0 = t.getAngle();
		t.left(60);
		t.forward(side);
		t.right(60);
		t.hexagon(side);
		t.left(60);
		t.backward(side);
		t.right(120);
		t.forward(side);
		t.backward(side);
		t.right(120);
		t.forward(side);
		t.backward(side);
		t.setAngle(a0);

	}

	public static void drawCubeDirection(Turtle t, double size, double angle, String direction) { //function to draw cube adjacent to the previous cube
		switch(direction) {
			case "right":
				t.right(60);
				t.forward(size);
				t.setAngle(angle);
				drawCube(t, size);
				break;
			case "left":
				t.left(60);
				t.forward(size);
				t.setAngle(angle);
				drawCube(t, size);
				break;
			case "up":
				t.right(60);
				t.forward(size);
				t.left(120);
				t.forward(size);
				t.setAngle(angle);
				drawCube(t, size);
				break;
			case "down":
				t.backward(size);
				drawCube(t, size);
				break;
		}

	}
}
