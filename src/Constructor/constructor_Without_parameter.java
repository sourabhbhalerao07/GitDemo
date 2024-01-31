package Constructor;

public class constructor_Without_parameter {
	
	// attributes
	
	String car;
	int year;
	
	// constructor with parameter
	
	constructor_Without_parameter(String carName, int yr)
	{
		//initialize attributes
		
		car = carName;
		year = yr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructor_Without_parameter obj = new constructor_Without_parameter("Alto", 2009);
		
		System.out.println(obj.car + " " + obj.year);
		

	}

}
