import java.util.Scanner;

public class Interstate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner( System.in );
		
		var hw = console.nextInt();
		var type = "";
		var dir = "";
		
		if ( hw >= 1 && hw <= 99) {
			type = "primary";
			if ( hw % 2 == 0 ) {
				dir = "east/west";
			}
			else {
				dir = "north/south";
			}
			System.out.println("The " + hw + " is " + type + ", going " + dir + ".");
		}
		else if (hw >= 100 && hw <= 999) {
			type = "auxiliary";
			int hwl2 = hw % 100;
			if ( hw % 2 == 0 ) {
				dir = "east/west";
			}
			else {
				dir = "north/south";
			}
			System.out.println("The " + hw + " is " + type + ", serving the " + hwl2 + ", going " + dir + ".");
		}
		else {
			System.out.println( hw + " is not a valid interstate highway number.");
		}
		
		console.close();
	}

}
