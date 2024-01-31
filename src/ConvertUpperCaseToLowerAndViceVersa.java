import java.util.Scanner;

public class ConvertUpperCaseToLowerAndViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch,ch2;
		System.out.println("Enter any char");
		Scanner r = new Scanner(System.in);
		ch=r.next().charAt(0);  //ch=B        
		          
		if(ch>='A' && ch<='Z')  //B>=A && B<=Z
		{
			ch2=Character.toLowerCase(ch);
			System.out.println("Lowercase " + ch2);
		}
		
		else
		{
			ch2=Character.toUpperCase(ch);
			System.out.println("Uppercase " + ch2);
		}	
	}

}
