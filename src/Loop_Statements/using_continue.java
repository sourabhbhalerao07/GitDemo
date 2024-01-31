package Loop_Statements;

public class using_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0; i<10; i++)
		{
			System.out.println(i);
			if(i==5)
			{
				//break;
				continue;
			}
		}
	}

}
