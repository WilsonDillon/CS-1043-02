import java.util.ArrayList;
import java.util.Scanner;

/*
* a. Convert boxing and unboxing to auto-boxing and auto-unboxing.
*/
public class ALWrapper {
	
	public static void main(String[] args) throws InterruptedException {
		
// Perform operations on an ArrayList
		
		double [] array = { 3.7, 89.5, 12.8, 16.1, 19.3 };
		
		Double hold; // Wrapper class required for ArrayList
		ArrayList<Double> myList = new ArrayList<Double>();
		
		System.out.printf("Start: The size of myList is: %d\n", myList.size());
		
		System.out.println("Inserting data into ArrayList:");
		for (double target : array) {
			myList.add(new Double(target));  // convert to auto-boxing
			System.out.print(".");
			Thread.sleep(250);
		}
		
		System.out.printf("\nThe size of myList is: %d\n", myList.size());
		
		System.out.println("ArrayList members: ");
		for (Double target : myList) { // convert to auto-unboxing
			System.out.printf("%.2f ", target.doubleValue());
		}
		
// b. Get object @ index 1
// c. Remove the object @ index 1 from the ArrayList
// d. Append the object to end of the list
// e. Convert the compareTo() operation to a relational operator.
		
		System.out.print("\nEnter a real number: ");
		Scanner console = new Scanner(System.in);
		double value = console.nextDouble();
		hold = new Double(value);
		
// e. Convert the compareTo() operation to a relational operator.

		if (hold.compareTo(myList.get(0)) > 0)
			myList.add(1, hold);
		else
			myList.add(0, hold);
		
		System.out.println("\n... after some changes, ArrayList content is:");
		
// f. Change to an enhanced for-loop, use auto-unboxing.
		for (int idx = 0; idx < myList.size(); idx++) {
			System.out.printf("%.2f ", myList.get(idx).doubleValue());
		}
		
		console.close();
	} // end main
} // end class