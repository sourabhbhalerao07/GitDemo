import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,sum;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=obj.nextInt();
		b=obj.nextInt();
		sum = a+b;
		System.out.println("Addition = " + sum);
		
	}

}
