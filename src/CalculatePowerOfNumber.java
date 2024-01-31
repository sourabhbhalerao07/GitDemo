import java.util.Scanner;

public class CalculatePowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calculate power of two numbers
		//input = 5
		//power = 3     //power means cube
		
		int n,p,result=1;
		System.out.println("Enter number");
		Scanner obj = new Scanner(System.in);
		n=obj.nextInt();
		System.out.println("Enter power");
		p=obj.nextInt();
		
		for(int i=1;i<=p;i++)
		{
			result=n*result;
		}
		System.out.println("power "+result);
		
		
		
		
	}

}
