import java.util.Scanner;

public class TaxTable {
	public static void main(String[] args) {
		Scanner console = new Scanner( System.in );
		System.out.println("Enter the marriage status (S|s for single, M|m for married), and the income: ");
		
		String status = console.next().substring(0,1);
		double income = console.nextDouble();
		
		double tax = 0.0;
		
		if ( status.equalsIgnoreCase("S") ) {
			if (income <= 0) {
				tax = 0.0;
			}
			else if ( income <= 21450.0 ) {
				tax = income * .15;
			}
			else if ( income <= 51900.0 ) {
				tax = 3217.5 + (income - 21450.) * .28;
			}
			else {
				tax = 11743.5 + (income - 51900.) * .31;
			}
			
			System.out.printf("Tax is: $%,.2f \n", tax );
		}
		else {
			if ( income <= 0 ) {
				tax = 0.0;
			}
			else if ( income <= 35800.0 ) {
				tax = income * .15;
			}
			else if ( income <= 86500.0 ) {
				tax = 5370. + (income - 35800.) * .28;
			}
			else {
				tax = 19566. + (income - 86500.) * .31;
			}
			
			System.out.printf("Tax is: $%,.2f \n", tax );
		}
	}
}