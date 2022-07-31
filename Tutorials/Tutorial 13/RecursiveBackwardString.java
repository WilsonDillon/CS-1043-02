import java.util.Scanner;

public class RecursiveBackwardString {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner( System.in );
		
		String myStr = scnr.nextLine();
		
		// Write string backward using iteration:
		backwardI( myStr );
		
		System.out.println();
		// Write string backward using a tail recursion:
		backwardTailR( myStr );
		
		System.out.println();
		// Write string backward using a forward recursion:
		backwardForwardR( myStr );
		
		scnr.close();
	}

	public static void backwardI( String inStr ) {
		
	}
	
	public static void backwardTailR( String inStr ) {
	
		
	}
	
	public static void backwardForwardR( String inStr ) {
		
	}
}
