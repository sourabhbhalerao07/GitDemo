import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		System.out.println("Enter age");
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		
		if(a>=18)
		{
			System.out.println("Eligible for votes");
		}
		
		else
		{
			System.out.println("Not Eligible for votes");
		}
	}

}
