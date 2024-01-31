package Constructor;

public class Constructor_Program {
	
	int x; // attributes of a class
	
	Constructor_Program()   // constructor without parameter
	{
		x = 10;  // initialise values of attribute
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor_Program obj = new Constructor_Program(); // this will call constructor
		
		System.out.println(obj.x);
	}

}
