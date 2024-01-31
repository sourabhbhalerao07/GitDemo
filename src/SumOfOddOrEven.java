import java.util.Scanner;

public class SumOfOddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i,sum=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter No.of Terms");
		n=obj.nextInt();
		
		if(n%2==0)
		{
			for(i=0;i<=n;i=i+2)
			{
				sum = sum+i;
			}
			System.out.println("sum of even number=" + sum);
		}
		
		else
		{
			for(i=1;i<=n;i=i+2)
			{
				sum = sum+i;
			}
			System.out.println("sum of odd number=" + sum);
		}
				
	}

}
