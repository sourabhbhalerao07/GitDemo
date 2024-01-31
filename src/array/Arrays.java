package array;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declare & instantiate
		//int [] roll = new int[5];    //Declares array & allocate memory for the values
		
		// insert values in array
		//roll[0] = 10;
		//roll[1] = 20;
		//roll[2] = 30;
		//roll[3] = 40;
		//roll[4] = 50;
		
		int [] roll = {10,20,30,40,50};
		
		//print size of an array
		System.out.println("size pf array:" + roll.length);
		
		//read values from array
		System.out.println("value of 4th element:" + roll[3]);
		
		//read all values of array using for loop
		
		for (int i = 0; i<roll.length;  i++)
		{
			System.out.println(roll[i]);
		}
		
		//read all values of array using for for each loop
		
		for (int i : roll)
		{
			System.out.println(i);
		}	
		
	}

}
