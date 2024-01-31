import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,sum=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter No.of term");
		n=obj.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			sum = sum + i;
			
		}
		System.out.println("ADDITION =" + sum);
	}

}
