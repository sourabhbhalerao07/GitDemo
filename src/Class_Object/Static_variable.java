package Class_Object;

public class Static_variable {
	
	// class variable
	
	int roll;           // non static
	String studentName;           // non static
	static String collegeName = "sinhgad college"  ;   //  static
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Static_variable student1 = new Static_variable();
		
		student1.studentName = "sourabh";
		student1.roll = 100;
		
		System.out.println(student1.studentName + ", " + student1.roll + ", " + student1.collegeName);
		
		Static_variable student2 = new Static_variable();
		
		student2.studentName = "swapnil";
		student2.roll = 100;
		
		System.out.println(student2.studentName + ", " + student2.roll + ", " + student2.collegeName);
	}

}
