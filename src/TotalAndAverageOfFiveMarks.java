import java.util.Scanner;

public class TotalAndAverageOfFiveMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Find total and average of five numbers

		int a,b,c,d,e;
		System.out.println("Enter  numbers");
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		d=obj.nextInt();
		e=obj.nextInt();
		
		int sum = a+b+c+d+e;
		System.out.println("Total Marks " + sum);
		
		double avg = sum/5.0;
		System.out.println("Average Marks " + avg);
		 
	}

}
