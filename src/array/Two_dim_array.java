package array;

public class Two_dim_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare & instantiate array
		//int[] [] a = new int [3][2];  // 3 rows & 2 columns
		
		// insert values ins array
		//a[row][col]
		
		//a[0][0] = 12; //row=0, col=0
		//a[0][1] = 12; //row=0, col=1
		
		//a[0][0] = 14; //row1, col=0
		//a[0][1] = 15; //row=0, col=1
		
		//a[0][0] = 16; //row=2, col=0
		//a[0][1] = 17; //row=2, col=1
		
		int[][] a = { {12,13}, {14,15}, {16,17} } ;
		
		// print size of row & columns
		
		System.out.println("no of rows:" + a.length);  // no of rows
		
		System.out.println("no of columns:" + a[0].length);   /// no of columns
		
		//read values of array using for loop
		
		for(int i=0; i<a.length; i++)    //outer for loop stands for row
		{
			for(int j=0; j<a[0].length; j++) ////inner for loop stands for columns   //i=0, i=1, 1=3(loop exit)
			{
				System.out.println(a[i][j]);    // j=0, j=1(loop exit)
			}
		}
		
		//read values of array using for  each loop
		
		for(int[]row : a)
		{
			for(int colvalue : row)  // {12,13}, {14,15}, {16,17}
			{
				System.out.println(colvalue);  // row=12,13 row=14,45 row=16,17
			}
		}
		
	}

}
