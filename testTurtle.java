import java.util.Scanner;

class testTurtle {
	public static void main(String[] args) {
		Turtle t = new Turtle(0.0,0.0,90);
		Scanner input = new Scanner(System.in);
		while(true) {
			int cmd = input.nextInt();
			switch(cmd) {
				case 8: t.forward(0.1);
					break;
				case 2: t.backward(0.1);
					break;
				case 4: t.left(30);
					break;
				case 6: t.right(30);
					break;
				default: System.out.println("Silly");
					 break;
			}
		
	
		}
	}
}
