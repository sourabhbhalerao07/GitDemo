import java.util.Scanner;

public class FindMaxBetweenTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		System.out.println("Enter two numbers");
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		
		if(a>b)
		{
			System.out.println("a is greater");
		}
		
		else
		{
			System.out.println("b is greater");
		}
		
	}

}
