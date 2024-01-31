package Loop_Statements;

public class Nested_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=0;i<=4;i++)  //outer loop will execute 4 times
		{
			System.out.println("outer loop started");
			
			for(int j=1;j<=4-i;j++)   //inner loop will execute 16 times
			{
				System.out.println("inner loop");
			}
			
			System.out.println("outer loop finished");
		}
	}

}
