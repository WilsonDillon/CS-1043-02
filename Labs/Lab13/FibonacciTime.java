import java.util.Scanner;

public class FibonacciTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner( System.in );
		long startTime;
		double totalTimeI, totalTimeR;
		
		int number = scnr.nextInt();
		
		startTime = System.currentTimeMillis();
		long resultI = fibI( number );
		totalTimeI = (System.currentTimeMillis() - startTime);

		System.out.printf( "Iteration result: %d\n", resultI );
		
		
	
		
		System.out.printf( "Iterative time =  %10.4f msec\n",  totalTimeI );

		
		scnr.close();
	}
	
	// TODO: Write the iterative and recrsive methods:
	
	public static long fibI( int number ) {
      return 1;
	}
	
	public static long fibR( int number ) {
      return 1;
				
	}

}
