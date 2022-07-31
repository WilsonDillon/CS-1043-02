import java.util.Scanner;
import java.io.*; 

public class ReadLines 
{
	public static void main( String [] args ) 
	{
		Scanner console = new Scanner( System.in );
		System.out.print("Enter the filename to read: ");
		String filename = console.next();
		File fileHandle = null;
		Scanner data = null;
		
	  // Open the file to scan the content. Determine the total number
	  // of delimited tokens with hasNext() & next();
	  try {
		  fileHandle = new File ( filename );
		  data = new Scanner ( fileHandle );
		  String record;
		  int count = 0;
		  while( data.hasNext() ) {
			  record = data.next();
			  count++ ;
		  }
		  System.out.printf("%s contains %d tokens.\n", filename, count );
		
	  // Reset & open the file to scan the content. Determine the total 
      // number of lines using a loop, hasNext(), and nextLine();
		  data.close();
		  data = new Scanner ( fileHandle );
		  count = 0;
		  while( data.hasNext() ) {
			  record = data.nextLine();
			  count++ ;
		  }
		  System.out.printf("%s contains %d lines.\n", filename, count );
		
	  // Reset & open the file. Display the tokens as a table of floating point data
	  // The delimiter character is " +" (any number of spaces).
		  data.close();
		  data = new Scanner ( fileHandle );
		  
		  double value; 
		  String [] tokens;
		  while ( data.hasNext() ) {
			  tokens = data.nextLine().trim().split(" +");
			  for ( String target: tokens) {
				  value = Double.parseDouble( target.trim() );
				  System.out.printf("%12.4f", value );
			  } 
			  System.out.println();
		  }
		  System.out.println( "Done!");
	  }
	  // Add a competent exception handler, use this print in the catch-clause:
	  catch ( FileNotFoundException err ) {
		  System.out.println("Error: " + err + " try again.");
	  }
	  if ( data != null ) {
		  data.close();
	  }
	  if ( console != null ) {
		  console.close();
	  }
		
		
	}
}
