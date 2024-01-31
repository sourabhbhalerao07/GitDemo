import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//6*1=6
		//6*2=12
		//6*3=18
		//6*4=24
		//6*5=30
		//6*6=36
		//6*7=42
		//6*8=48
		//6*9=54
		//6*10=60
		
		int a;
		System.out.println("Enter any number");
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+"*"+i+"="+a*i);
		}
	}

}
