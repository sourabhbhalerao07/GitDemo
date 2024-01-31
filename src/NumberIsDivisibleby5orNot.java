import java.util.Scanner;

public class NumberIsDivisibleby5orNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// input 10 -----> Divisible by 5
		// input 9 ----->  not Divisible by 5
		
		int a;
		System.out.println("Enter any number");
		Scanner r = new Scanner(System.in);
		a=r.nextInt();          
		
		if(a%5==0 )
		{ 
			System.out.println("Divisible by 5");
		}	
		
		else
		{
			System.out.println("Not Divisible by 5");
		}
	}

}
