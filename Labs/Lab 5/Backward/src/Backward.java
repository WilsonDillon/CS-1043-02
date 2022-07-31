import java.util.Scanner;

public class Backward {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		
		String input = console.nextLine();
		
		for (int i = input.length(); i > 0; --i) {
			char c = input.charAt(i-1);
			System.out.print(c);
		}
		
		console.close();
	}
}
