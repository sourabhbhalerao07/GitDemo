import java.util.Scanner;

public class SwapTwoNumbersUsingThirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ram ------> 10  sham------>20
		//Ram ------> 10 <---->Raju  sham------>20

		int a,b,temp;
		System.out.println("Enter two numbers");
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		
		
		System.out.println("Before swapping " +a+" "+b);
		
		temp=a;  //temp=100
		a=b;     //a=200
		b=temp;  //temp=100
		
		System.out.println("After swapping " +a+" "+b);
		
	}

}
