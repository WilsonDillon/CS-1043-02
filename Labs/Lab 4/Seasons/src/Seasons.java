import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console = new Scanner( System.in );
		
		var month = console.next();
		int day = console.nextInt();
		
		month = month.toLowerCase();
		
		if ( month.equalsIgnoreCase("march") ||
			 month.equalsIgnoreCase("april") ||
			 month.equalsIgnoreCase("may") ||
			 month.equalsIgnoreCase("june") ) {
			if ( month.equalsIgnoreCase("march") && day < 20 ) {
				System.out.println("winter");
			}
			else if ( month.equalsIgnoreCase("june") && day > 20 ) {
				System.out.println("summer");
			}
			else {
				System.out.println("spring");
			}
		}
		else if ( month.equalsIgnoreCase("june") ||
				  month.equalsIgnoreCase("july") ||
				  month.equalsIgnoreCase("august") ||
				  month.equalsIgnoreCase("september") ) {
			if ( month.equalsIgnoreCase("june") && day < 21 ) {
				System.out.println("spring");
			}
			else if ( month.equalsIgnoreCase("september") && day > 21 ) {
				System.out.println("autumn");
			}
			else {
				System.out.println("summer");
			} 
		}
		else if ( month.equalsIgnoreCase("september") ||
				  month.equalsIgnoreCase("october") ||
				  month.equalsIgnoreCase("november") ||
				  month.equalsIgnoreCase("december") ) {
			if ( month.equalsIgnoreCase("september") && day < 22 ) {
				System.out.println("summer");
			}
			else if ( month.equalsIgnoreCase("december") && day > 20 ) {
				System.out.println("spring");
			}
			else {
				System.out.println("autumn");
			} 
		}
		else if ( month.equalsIgnoreCase("december") ||
				  month.equalsIgnoreCase("january") ||
				  month.equalsIgnoreCase("february") ||
				  month.equalsIgnoreCase("march") ) {
			if ( month.equalsIgnoreCase("december") && day < 21 ) {
				System.out.println("autumn");
			}
			else if ( month.equalsIgnoreCase("march") && day > 20 ) {
				System.out.println("spring");
			}
			else {
				System.out.println("winter");
			} 
		}
		console.close();
	}

}
