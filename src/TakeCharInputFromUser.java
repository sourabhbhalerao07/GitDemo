import java.util.Scanner;

public class TakeCharInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To take char input from user

		char ch;
		System.out.println("please enter character");
		Scanner obj = new Scanner(System.in);
		ch = obj.next().charAt(2);
		System.out.println(ch);
		
	    			
	}

}
