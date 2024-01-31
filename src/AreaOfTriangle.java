import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a,b,c
		//Find Perimeter
		//Arra of triangle
		
		int a,b,c,sp;double area;
		System.out.println("Enter value for sides of triangle");
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
       
		//Below formula is to calculate perimeter
		sp=(a+b+c)/2;
		
		area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
		System.out.println("Area of Circle " + area);
	}

}
