import java.util.Scanner;

public class ReadLines 
{
	public static void main( String [] args ) 
	{
		Scanner console = new Scanner( System.in );
		System.out.print("Enter the filename to read: ");
		String filename = console.next();
		
	  // Open the file to scan the content. Determine the total number
	  // of delimited tokens with hasNext() & next();
	  // System.out.printf("%s contains %d tokens.\n", filename, count );
		
	  // Reset & open the file to scan the content. Determine the total 
     // number of lines using a loop, hasNext(), and nextLine();
	  // System.out.printf("%s contains %d lines.\n", filename, count );
		
	  // Reset & open the file. Display the tokens as a table of floating point data
	  // The delimiter character is " +" (any number of spaces).
	  // System.out.printf("%12.4f", value );
	  
	  // Add a competent exception handler, use this print in the catch-clause:
	  //  System.out.println("Error: " + err + " try again.");
		
		System.out.println( "Done!");
	}
}
