import java.util.Scanner; 

public class Wedges {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		int nRows = console.nextInt();
		int nCols = nRows;
		int nSpaces = 0;
		int ir, ic, ib; 
		
		for ( ir = 1; ir<= nRows; ++ir ) {
			for ( ib = 1; ib <= nSpaces; ++ib ) {
				System.out.print(' ');
			}
			for ( ic = 1; ic <= nCols; ++ic ) {
				System.out.print('*');
			}
			System.out.println();
			++nSpaces;
			--nCols;
		}
		
		console.close();
	}
}
