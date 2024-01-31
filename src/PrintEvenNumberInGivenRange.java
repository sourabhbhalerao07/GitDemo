import java.util.Scanner;

public class PrintEvenNumberInGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter No.of term");
		n=obj.nextInt();
		
		for(int i=2;i<=n;i=i+2)
		{
			System.out.println(i + " ");
			
		}
	}

}
