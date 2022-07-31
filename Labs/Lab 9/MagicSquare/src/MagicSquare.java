public class MagicSquare {

   // Example stub:
	public static boolean isItSquare( int [][] array2D ) {
		boolean isTrue = false;
		for ( int i = 0; i < array2D.length; i++) {
			if ( array2D.length == array2D[i].length ) {
				isTrue = true;
			}
			else isTrue = false;
		}
		return isTrue;
	}
	// Enter these stubs FIRST! : sumDiagonal, sumRowI, sumColumnJ, hasNumber.
	
	public static boolean hasNumber( int [][] array2D, int num ) {
		int x = 0;
		for ( int i = 0; i < array2D.length; i++ ) {
			for ( int j = 0; j < array2D[i].length; j++ ) {
				if ( array2D[i][j] == num ) {
					x = array2D[i][j];
				}
			}
		}
		if ( x == num ) return true;
		else return false;
	}
	
	public static int sumRowI( int [][] array2D, int i ) {
		int sum = 0;
		for ( int x = 0; x < array2D[i].length; x++) {
			sum += array2D[i][x];
		}
		return sum;
	}
	
	public static int sumColumnJ( int [][] array2D, int j ) {
		int sum = 0;
		for ( int x = 0; x < array2D.length; x++) {
			sum += array2D[x][j];
		}
		return sum;
	}
	
	public static int sumDiagonal( int [][] array2D, boolean isMain ) {
		int sum = 0;
		if ( isMain == true ) {
			int j = 0;
			for ( int i = 0; i < array2D.length; i++ ) {
				sum += array2D[i][j];
				j++;
			}
			return sum;
		}
		else {
			int j = array2D.length - 1;
			for (int i = 0; i < array2D.length; i++ ) {
				sum += array2D[i][j];
				j--;
			}
			return sum;
		}
	}
}