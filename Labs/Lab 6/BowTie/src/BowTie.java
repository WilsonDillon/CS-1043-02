import java.util.Scanner;
public class BowTie {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		int nRows = console.nextInt();
		
		if ( nRows % 2 == 1) {
			int nSpaces = nRows - 2;
			int nStars = 1;
			
			for ( int ia = 1; ia <= (nRows - 1) / 2; ++ia ) {
				for ( int ix = 1; ix <= nStars; ++ix ) {
					System.out.print('*');
				}
				for ( int iy = 1; iy <= nSpaces; ++iy ) {
					System.out.print(' ');
				}
				for ( int iz = 1; iz <= nStars; ++iz ) {
					System.out.print('*');
				}
				System.out.println();
				nStars += 1;
				nSpaces -= 2;
			}
			for ( int ib = 1; ib <= nRows; ++ib) {
				System.out.print('*');
			}
			System.out.println();
			nSpaces = 1;
			nStars = (nRows - 1) / 2;
			for ( int ic = 1; ic <= (nRows - 1) / 2; ++ic ) {
				for ( int id = 1; id <= nStars; ++id ) {
					System.out.print('*');
				}
				for ( int ig = 1; ig <= nSpaces; ++ig ) {
					System.out.print(' ');
				}
				for ( int ih = 1; ih <= nStars; ++ih ) {
					System.out.print('*');
				}
				System.out.println();
				nStars -= 1;
				nSpaces += 2;
			}
		}
		
		console.close();
	}
}
