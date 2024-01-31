import java.util.Scanner;

public class CalculateTaxOfSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//sal<=10000                   - No tax
		//sal>10000 and sal<=100000    - 10%tax
		//sal>=100000                  - 20%tax
		
		int sal; double tax;
		System.out.println("Enter any number");
		Scanner obj = new Scanner(System.in);
		sal=obj.nextInt();
		
		if(sal<=10000)
		{
			System.out.println(sal+ "No tax");
		}
		
		else if(sal>10000 && sal<=100000)
		{
			tax=sal*0.10;
			System.out.println(sal+ " "+tax);
		}
		
		else
		{
			tax=sal*0.20;
			System.out.println(sal+ " "+tax);
		}
		
	}

}
