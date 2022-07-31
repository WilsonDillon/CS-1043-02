import java.util.Scanner;
public class HourGlass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		int nRows = console.nextInt();
		
		if ( nRows % 2 == 1 ) {
			int nStars = nRows;
			int nSpaces = 0;
			
			for ( int ix = 1; ix <= nRows; ++ix ) {
				if ( nStars > 0 ) {
					for ( int iy = 1; iy <= nSpaces; ++iy ) {
						System.out.print(' ');
					}
					for ( int iz = 1; iz <= nStars; ++iz ) {
						System.out.print('*');
					}
					System.out.println();
					nStars -= 2;
					nSpaces += 1;
				}
			}
		}
		if ( nRows % 2 == 1 ) {
			int nSpaces = (nRows - 1) / 2;
			int nStars = 3;
			
			for ( int ir = 1; ir <= nRows / 2; ++ir ) {
				--nSpaces;
				for ( int ib = 1; ib <= nSpaces; ++ib ) {
					System.out.print(' ');
				}
				for ( int ic = 1; ic <= nStars; ++ic ) {
					System.out.print('*');
				}
				System.out.println();
				nStars += 2;
			}
		}
		
		console.close();
	}

}
