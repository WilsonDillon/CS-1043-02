import java.util.Scanner;

public class Lab3WeeklyPay {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter the wage and hours worked per week:");
		
		double wages = scnr.nextDouble();
		double hours = scnr.nextDouble();
		double pay =  0.00;
		
		if ( hours > 40 ) {
			pay = wages * 40 + (hours - 40) * wages * 1.5;
		}
		else {
			pay = wages * hours;
		}
		
		System.out.printf("Worker pay is $%.2f\n", pay);
		
		scnr.close();
	}
}
