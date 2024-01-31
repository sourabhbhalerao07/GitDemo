package Class_Object;

public class Calculator {
	
	int num1;
	int num2;
	int result;
	
	void Add()
	{
		result = num1 + num2;
		System.out.println(result);
	}
	
	void substract()
	{
		result = num1 - num2;
		System.out.println(result);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator obj = new Calculator();
		
		obj.num1 = 20;
		obj.num2 = 30;
		obj.Add();
		obj.substract();
		
Calculator obj1 = new Calculator();
		
		obj.num1 = 40;
		obj.num2 = 30;
		obj.Add();
		obj.substract();
	}

}
