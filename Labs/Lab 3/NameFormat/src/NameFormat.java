import java.util.Scanner;

public class NameFormat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		String name = scnr.nextLine();
		
		int firstSpace = name.indexOf(" ");
		String firstName = name.substring(0, firstSpace);
		String restOfName = name.substring(firstSpace+1, name.length());
		int secondSpace = restOfName.indexOf(" ");
		
		if ( secondSpace == -1 ) {
			System.out.println(restOfName + ", " + firstName);
		}
		else {
			String middleName = restOfName.substring(0, secondSpace);
			String lastName = restOfName.substring(secondSpace+1, restOfName.length());
			String middleInitial = middleName.substring(0, 1);
			System.out.println(lastName + ", " + firstName + " " + middleInitial + ".");
		}
		
		scnr.close();
	}
}
