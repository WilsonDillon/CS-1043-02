import java.util.Scanner; 

public class LetterGrade {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		double grade = scnr.nextDouble();
		
		if ( grade >= 90 ) {
			System.out.println("A");
		}
		else if ( grade >= 80 ) {
			System.out.println("B");
		}
		else if ( grade >= 70 ) {
			System.out.println("C");
		}
		else if ( grade >= 60 ) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		scnr.close();
	}
}
