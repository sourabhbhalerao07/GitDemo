import java.util.Scanner;

public class CharIsVowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To check char is vowel or consonant
		
		char ch;
		System.out.println("please enter character");
		Scanner obj = new Scanner(System.in);
		ch = obj.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
		{
			System.out.println("Vowel");
		}
		
		else
		{
			System.out.println("Consonant");
		}

	}

}
