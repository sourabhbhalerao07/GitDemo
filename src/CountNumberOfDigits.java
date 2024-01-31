import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,count=0;
		System.out.println("Enter number");
		Scanner obj = new Scanner(System.in);
		n=obj.nextInt();
		
		while(n>0)
		{
			n=n/10;
			count++;
		}
		
		System.out.println("No.of digits " + count);
	}

}
