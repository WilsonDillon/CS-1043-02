import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class InsertionSort {

	public static void main(String[] args) throws IOException {
		
		String filename = null;
		Scanner scnr = null ;
		Scanner tokens = null;
		double value = 0.0;
// 1. Instantiate an ArrayList object named myList for type Double.
		ArrayList <Double> myList = new ArrayList <Double> ();
// This logic will use the command line argument or prompt for input:	
      if ( args.length != 0 ) // args is an array!
			filename = args[0];
		else {
			scnr = new Scanner( System.in );
			filename = scnr.nextLine().strip();
		}

// 2. Open the file to read using the File and Scanner classes:
		File fHandle = new File (filename);
		tokens = new Scanner (fHandle);

		int counter = 0;  // This counts the numbers as they are read.
		 
		myList.add( tokens.nextDouble() ); // put first item in list.
		++counter;				  // Count it.	
		
		while ( tokens.hasNext() ) {
		// 3. Get the next number from the data file.
			 
		// 4. Place the current number into your list and count it.
			myList.add( tokens.nextDouble() );
			++counter;
		} 
			// repeat until all numbers are loaded into the ArrayList.

		for (int j = 1; j < myList.size(); j++) {
	        value = myList.get(j);
	        int i = j-1;
	        while ((i > -1) && (myList.get(i) > value )) {
	            myList.set(i+1, myList.get(i));
	            i--;
	        }
	        myList.set(i+1, value);
	    }
			
	// 5. Confirm your ArrayList is populated with the data by printing
		for ( int idx = 0; idx < counter; idx++ ) {
			System.out.printf( "%.3f\n",  myList.get(idx) );
		}
		
      if ( scnr != null ) { scnr.close(); }
		if ( tokens != null ) { tokens.close(); }	
	}
}
