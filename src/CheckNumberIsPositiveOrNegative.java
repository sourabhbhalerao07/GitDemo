import java.util.Scanner;

public class CheckNumberIsPositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		System.out.println("Enter any numbers");
		Scanner r = new Scanner(System.in);
		a=r.nextInt();          
		
		if(a<0)
		{ 
			System.out.println("negative number");
		}	
		
		else if (a>0)
		{
			System.out.println("positive number");
		}
		
       else if (a==0)
       {
    	   System.out.println("neither positive nor negative");
	   }
	}

}
