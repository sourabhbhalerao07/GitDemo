import java.util.Scanner;

public class PrintMonthAndNumberOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		System.out.println("Enter any number");
		Scanner r = new Scanner(System.in);
		a=r.nextInt();
		
		switch(a)
		{
		case 0: System.out.println("January = 31 days");
		break;
		
		case 1: System.out.println("february = 28 days");
		break;
		
		case 2: System.out.println("march = 31 days");
		break;
		
		case 3: System.out.println("april = 30 days");
		break;
		
		case 4: System.out.println("may = 31 days");
		break;
		
		case 5: System.out.println("june = 30 days");
		break;
		
		case 6: System.out.println("july = 31 days");
		break;
		}
	
	}

}
