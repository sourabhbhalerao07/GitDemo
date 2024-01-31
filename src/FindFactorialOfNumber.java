import java.util.Scanner;

public class FindFactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,fact=1;
		System.out.println("Enter number");
		Scanner obj = new Scanner(System.in);
		n=obj.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}	
		
		System.out.println("Factorial of given number ="+ fact);
	}

}
