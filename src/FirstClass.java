
public class FirstClass {
	
	static int a = 4;
	
	public void getData()
	{
		System.out.println("I am in method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FirstClass fn = new FirstClass();
		SecondClass sc = new SecondClass();
		
		sc.setdata();
		fn.getData();
		System.out.println(a);
		System.out.println("hello");
		System.out.println("hello world");

	}

}
