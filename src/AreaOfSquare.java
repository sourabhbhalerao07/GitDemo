import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//area of square = side*side
		int side,area;
		int r;
		System.out.println("Enter any number");
		Scanner obj = new Scanner(System.in);
		side=obj.nextInt();

		area=side*side;
		System.out.println("Area of Square " + area);
	}

}
