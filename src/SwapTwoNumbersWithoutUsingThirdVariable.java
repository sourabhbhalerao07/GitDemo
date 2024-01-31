import java.util.Scanner;

public class SwapTwoNumbersWithoutUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		System.out.println("Enter two numbers");
		Scanner r = new Scanner(System.in);
		a=r.nextInt();          //a=100
		b=r.nextInt();          //b=200
		System.out.println("Before Swapping "+ a+" "+b);
		a=a+b;  //a=100+200=300
		b=a-b;  //b=300-200=100
		a=a-b;  //a=300-100=200
		
		System.out.println("After Swapping "+ a+" "+b);
		
	}

}
