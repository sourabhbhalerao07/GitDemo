import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number");
		n=obj.nextInt();
		
		if(n%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}

}
