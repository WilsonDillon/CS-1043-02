import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner( System.in );
		
		int number = scnr.nextInt();
		int result = sumNum(number);
		
		System.out.print( result );
		
		scnr.close();
	}
	
   // TODO: Write a static method to recursively sum the digits of an input integer.
	public static int sumNum ( int num ) {
		int sum = num % 10;
		if ( num == 0 ) {
			return 0;
		}
		else {
			return sum + sumNum(num / 10);
		}
	}
}
