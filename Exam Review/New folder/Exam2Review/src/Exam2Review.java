
public class Exam2Review {
	public static void main(String[] args) {

		//2
		System.out.println("#2 -- Print Nested Loops");
		for ( int i = 1; i <= 4; i++) {
			for ( int x = 1; x <= i; x++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int x = 4; x > i; x--) {
				System.out.print(" ");
			}
			for ( int y = 1; y <= i; y++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//3
		System.out.println("#3 -- Arrays");
		System.out.println("  How to declare arrays:");
		System.out.println("    type[]  name = new type[n];");
		System.out.println("  How to instantiate arrays:");
		System.out.println("    name[index] = value;");
		System.out.println("  Array properties:");
		System.out.println("    .length()");
		System.out.println("    .trim()");
		System.out.println("    .split()");
		
		//8
		System.out.println("#8 -- Enhanced For-Loop");
		System.out.println("  for ( int x : arrayName ) {");
		System.out.println("    System.out.print(\"x\");");
		System.out.println("  }");
		
		//11 
		System.out.println("#11 -- Printf");
		double dblTotal = 123654.789 ; 
		int intValue = 27; 
		String stringVal = "Brick Brack";

		System.out.printf("Total is: $%,.2f%n", dblTotal); // %n is the new-line* 
		System.out.printf("Total: %10.2f: ", dblTotal); 
		System.out.printf("%4d\n", intValue);
		System.out.printf("%-20.9s!\n", stringVal); // \n is the new-line

	}
}
