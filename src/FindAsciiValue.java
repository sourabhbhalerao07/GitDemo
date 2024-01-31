import java.util.Scanner;

public class FindAsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To print ASCII value of particular character

		char ch;
		System.out.println("please enter character");
		Scanner obj = new Scanner(System.in);
		ch = obj.next().charAt(0);
		
		int a=ch;
		System.out.println("ASCII value of ch is " + a);
	}

}
