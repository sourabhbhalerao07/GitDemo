import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		System.out.println("Enter any number");
		Scanner r = new Scanner(System.in);
		a=r.nextInt();
		
		while(a>0)
		{
			b=a%10;
			System.out.println(b);
			a=a/10;
		}
	}

}
