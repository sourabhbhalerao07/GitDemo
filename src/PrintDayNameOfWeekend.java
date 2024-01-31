import java.util.Scanner;

public class PrintDayNameOfWeekend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		System.out.println("Enter any number");
		Scanner r = new Scanner(System.in);
		a=r.nextInt();
		
		switch(a)
		{
		case 0: System.out.println("Sunday");
		break;
		
		case 1: System.out.println("Monday");
		break;
		
		case 2: System.out.println("Tuesday");
		break;
		
		case 3: System.out.println("Wednesday");
		break;
		
		case 4: System.out.println("Thursday");
		break;
		
		case 5: System.out.println("Friday");
		break;
		
		case 6: System.out.println("Saturday");
		break;
		
		default: System.out.println("Invalid code");
		}
	}

}
