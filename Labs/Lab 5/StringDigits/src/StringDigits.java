import java.util.Scanner;
public class StringDigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console = new Scanner(System.in);
		
		String nums = "";
		String chars = "";
		
		String input = console.nextLine();
		
		for (int i = 0; i <= input.length() - 1; ++i) {
			char c = input.charAt(i);
			if ( Character.isDigit(c) ) {
				nums = nums + c;
			}
			if ( !Character.isDigit(c) ) {
				chars = chars + c;
			}
		}
		
		System.out.println(nums);
		System.out.println(chars);
		
		console.close();
	}
}
