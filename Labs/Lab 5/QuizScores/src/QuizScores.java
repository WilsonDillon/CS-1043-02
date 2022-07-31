import java.util.Scanner;

public class QuizScores {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		
		double total = 0.0;
		double min = Double.MAX_VALUE;
		double max = -Double.MAX_VALUE;
		int count = 0;
		double avg = 0.0;
		
		System.out.println("Enter a score or enter 'stop' to exit:");
		var input = console.nextLine();
		
			while ( !input.equals("stop") && !input.equals("exit") ) {
				
				Double score = Double.parseDouble(input);
				total = total + score;
				count = count + 1;
				if ( score > max ) {
					max = score;
				}
				if ( score < min ) {
					min = score;
				}
				avg = total / count;
				
				System.out.println("Enter a score or enter 'stop' to exit:");
				input = console.nextLine();
			}
			
			if ( count > 0 ) {
				System.out.printf("Sum of quiz scores: %.1f\n", total );
				System.out.println("Number of quiz scores: " + count );
				System.out.printf("Average quiz score: %.1f\n", avg );
				System.out.printf("Maximum quiz score: %.1f\n", max );
				System.out.printf("Minimum quiz score: %.1f\n", min );
			}
			console.close();
	}
}
