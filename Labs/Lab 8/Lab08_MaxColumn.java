public class Lab08_MaxColumn {
	public static void main( String [] args ) {
		// find the column in the data array with the maximum sum.
		int [][] data = {    { 7,  2,   0,   8 }, 
                           { 6,   5,   4,   9,   2 }, 
                           { 1,   2,   3 }   
                      };
	
		int ir, ic;
		
		/*
		 *  Use a for-loop to determine the maximum row length.
		 */
		int maxRowLength = data[0].length; // Add your code here:
		
	

		/*
		 *  Find the column with the maximum sum.
		 */
		int maxSum = Integer.MIN_VALUE; // smallest possible value
		int colIndexMaxSum = 0;
		int total;
		// Add your code here:
		
		System.out.printf("Column index %d, has the largest sum = %d.\n", 
			colIndexMaxSum, maxSum );
	}
}
