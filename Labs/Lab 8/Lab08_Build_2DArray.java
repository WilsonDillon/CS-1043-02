import java.util.Scanner;

public class Lab08_Build_2DArray {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int nRows = Integer.parseInt( console.nextLine() ); 
		nRows = Math.max(0, nRows);
		
		// Define the arrays:
		String [] inputData;
		int[][] data = new int[nRows][]; // allocate number of rows
      int ir, ic;

		// For each row:
			System.out.print("Enter a row of comma separated numbers: ");
			
			data[ir] = new int[inputData.length]; // allocate row length

		      // For each String, convert and place in the 2D-array.
		
		
		/*
		 * Display the 2D-array in table format using a nested for-loop:
		 */
		      // System.out.printf( "%5d", data[rowIndex][columnIndex] );

		console.close();
	}
}
