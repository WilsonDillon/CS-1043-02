import java.util.Scanner;

public class DicePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		int num = console.nextInt();
		int ir, ic;
		
		for ( ir = 1; ir <= num; ir++ ) {
			for ( ic = 1; ic <= num; ic++ ) {
				System.out.printf("(%d, %d) ", ir, ic );
			}
			System.out.println();
		}
		
		console.close();
	}

}
