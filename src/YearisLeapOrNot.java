import java.util.Scanner;

public class YearisLeapOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  1. century (100%=0 and 400%=0)=leap year for ex-2000,2400
		//  2. yearly (100%!=0 and 4%=0)  ex-2020  2024
		//  non leap year 1700 1800
		int a;
		System.out.println("Enter year");
		Scanner r = new Scanner(System.in);
		a=r.nextInt();          
		
		if(a%100==0 && a%400==0 || a%100!=0 && a%4==0 )
		{ 
			System.out.println("leap year");
		}	
		
		else
		{
			System.out.println("non leap year");
		}
	}

}
