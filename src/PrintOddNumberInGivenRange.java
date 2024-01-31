import java.util.Scanner;

public class PrintOddNumberInGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter No.of term");
		n=obj.nextInt();
		
		for(int i=1;i<=n;i=i+2)
		{
			System.out.println(i + " ");
			
		}
	}

}
