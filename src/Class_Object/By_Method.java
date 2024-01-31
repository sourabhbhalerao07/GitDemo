package Class_Object;

public class By_Method {
	
	// instance variable
	
	String name;
	int rollno;
	
	//Method
	
	void insertRecord(String studentName, int studentRollno)
	{
		name = studentName;
		rollno = studentRollno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		By_Method obj1 = new By_Method();
		
		obj1.insertRecord("ssss", 010000);
		
		

	}

}
