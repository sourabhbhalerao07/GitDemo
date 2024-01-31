import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//area of circle=PI*r*r
		final double PI = 3.14,area;
		int r;
		System.out.println("Enter any number");
		Scanner obj = new Scanner(System.in);
		r=obj.nextInt();
		
		area=PI*r*r;
		System.out.println("Area of Circle " + area);
	}

}
