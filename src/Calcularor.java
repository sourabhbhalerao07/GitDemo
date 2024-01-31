import java.util.Scanner;

public class Calcularor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// input n1,n2------>(Select Operation) Result
		int n1,n2,ch,cal;
		System.out.println("Enter two numbers");
		Scanner obj = new Scanner(System.in);
		n1=obj.nextInt();
		n2=obj.nextInt();
		System.out.println("Select Operation");
		ch=obj.nextInt();
		
		if(ch==1)
		{
			cal=n1+n2;
			System.out.println("ADDITION " + cal);
		}
		
		else if (ch==2) 
		{
			cal=n1-n2;
			System.out.println("SUBSTRACTION " + cal);
		}
		
		else if (ch==3) 
		{
			cal=n1*n2;
			System.out.println("MULTIPLICATION " + cal);
		}
		
		else if (ch==4) 
		{
			cal=n1/n2;
			System.out.println("DIVISION " + cal);
		}
		
		else if (ch==5)
		{
			cal=n1%n2;
			System.out.println("REMAINDER " + cal);
		}
		
		
		
		
	}

}
