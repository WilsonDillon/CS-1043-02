import java.util.Scanner;
public class FormatTable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner( System.in );
		
		double loanAmount = console.nextDouble();
		double APR = 4.0;
		int years = 0;
		int numberOfpayments;
		double tmp;
		double payment;
		
		System.out.printf("Table of monthly payments "
				+ "for a dollar loan amount of $%,.2f\n" , loanAmount);
		System.out.println();
		System.out.println("Years:          15"
				+ "             20"
				+ "             25"
				+ "             30");
		for ( int i = 0; i < 65; ++i) {
			System.out.print("_");
		}
		System.out.println();
		for ( APR = 4.0; APR <= 7.0; APR += .5 ) {
			System.out.print(APR + "% ");
			for ( years = 15; years <= 30; years += 5 ) {
				numberOfpayments = years * 12;
				tmp = Math.pow( (1.0 + ((APR/12)/100)), numberOfpayments );
				payment = ( loanAmount * ((APR/12)/100) * tmp ) / (tmp-1);
				System.out.printf("%15.2f", payment);
			}
			System.out.println();
		}
		
		console.close();
	}
}
