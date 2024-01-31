package Class_Object;

public class second_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		By_reference_variable obj1 = new By_reference_variable();
		By_reference_variable obj2 = new By_reference_variable();
		
		
       // Initialize object
		obj1.name = "Sourabh";
		obj1.rollno = 100;
		
		obj2.name = "Vinayak";
	    obj2.rollno = 101;
		
		//print information of student
		obj1.displayInformation();
		obj2.displayInformation();
	}

}
