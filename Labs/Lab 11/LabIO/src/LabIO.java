import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class LabIO
{
   private double [][] data;    // rows = data.length;
                                // cols = data[i].length;
   public static void main( String [] args )
        // throws IOException     
   {
        LabIO fileTest = new LabIO();
        fileTest.readData();
        System.out.println( fileTest.toString() );
        fileTest.writeData();
   }

   public void readData() //     throws IOException 
   {
        Scanner console = new Scanner( System.in );
        String outMsg = "Enter the input data filename: ";
        Scanner tokens = null;
        boolean repeat;
        console.close();
        
        do {
        	
        repeat = false;
        String inFile = JOptionPane.showInputDialog( outMsg );

        try {
           File file = new File( inFile );       
           // 1 connect to the file
           tokens = new Scanner( file ); 
           // 2 buffer the data

           int nrows = tokens.nextInt(); 
           // 3 get the number of rows.

           int ncols = tokens.nextInt(); 
           // 3 get the number of cols.

           // 4 allocate space for the 2-d data array instance field:
           data = new double[nrows][ncols];
        
           // 5 write a nested loop to read the data into the data array.
           for ( int ir=0; ir < nrows ; ir++ ) {
        	   for ( int ic=0; ic < ncols ; ic++ ) {
        		   data[ir][ic] = tokens.nextDouble();
        	   }
           }
           // 6 close the file:
           } catch ( FileNotFoundException err ) {
        	   System.out.println( err );
        	   repeat = true;
           } finally {
        	   if ( tokens != null ) tokens.close();
           }
       
        	
        } while ( repeat );

   }   // end readData()

   public void writeData() // throws IOException     
   {
      // 1. prompt using the java.swing package for a file name to write.
	   
	   String outMsg = "Enter the output filename: ";

       String outFile = JOptionPane.showInputDialog( outMsg );
      // 2. Allocate the file and allow buffering with printf
       PrintWriter out = null;
       try {
       FileWriter writeIt = new FileWriter( outFile );
       out = new PrintWriter( writeIt );
       
      // 3. write the number of rows into the file
       out.printf( "%d\n", data.length );
      // 4. write the number of columns into the file
       out.printf( "%d\n", data[0].length ); // all rows same length
       
	  // 5. Use the toString method to create a string and write into your output file.
       String myData = this.toString();
       out.printf( "%s", myData );
       
      // 6. Write your name into the file:
       out.printf("%s\n", "Dillon Wilson" );
       } catch ( IOException err ) {
    	   System.out.println( err );
       }
      // 8. close the file.
       if ( out != null ) out.close();
      
       
   }  // end of writeData
   
   public String toString( ) {
	   String str = "";
	   for ( int ir = 0; ir < data.length ; ir++ ) {
		   for ( int ic = 0; ic < data[ir].length; ic++ ) {
			   str += String.format( "%10.2f", data[ir][ic] );
		   }
		   str += "\n";
	   }
	   return str;
   }

} // end class