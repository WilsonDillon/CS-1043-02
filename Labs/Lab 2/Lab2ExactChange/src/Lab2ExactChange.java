import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Lab2ExactChange {  
	   
   public static void main( String[] args ) {
		   
	   final double PENNY_VALUE = 0.01;
	   final double NICKEL_VALUE = 0.05;
	   final double DIME_VALUE = 0.1;
	   final double QUARTER_VALUE = 0.25;
	   final double HALFDOLLAR_VALUE = 0.5;
	   final double DOLLAR_VALUE = 1.0;
	   

	   Scanner console = new Scanner ( System.in );
	   
	   System.out.printf("\nEnter the amount in cents:\n");
	   int cents = console.nextInt();
	   
	   System.out.printf("The change for " + cents + " cents is:");
	   
	   int dollars = cents / 100;
	   cents %= 100; 
	   
	   int halfdollars = cents / 50;
	   cents %= 50;
	   
	   int quarters = cents / 25; 
	   cents %= 25;
	   
	   int dimes = cents / 10;
	   cents %= 10;
	   
	   int nickels = cents / 5;
	   cents %= 5;
	   
	   int pennies = cents / 1;
	   cents %= 1;
	   
	   

	   System.out.printf( 
	   			"\nDollars = " + dollars 
	   			+ "\nHalf-Dollars = " + halfdollars
	   			+ "\nQuarters = " + quarters
	   			+ "\nDimes = " + dimes
	   			+ "\nNickels = " + nickels
	   			+ "\nPennies = " + pennies
	   );
	   console.close();

   } // end main
}    // end class
