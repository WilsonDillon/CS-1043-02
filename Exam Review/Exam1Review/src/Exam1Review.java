
public class Exam1Review {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 4;
		int j = 7;
		double x = 12.0;   
		double y = 5.0;
		String s = "Hello";      
		String t = "World"; 
		
		System.out.println( (9 % 5) );
		
		double z = j / i;
		System.out.println( z );
		
		if ( (i > j) || (x != y) == true) {
			System.out.println("T");
		}
		else {
			System.out.println("F");
		}
		
		var aa = 4 % 11 * j / 3; 
		System.out.println( aa );
		
		System.out.println( (j / i + j % i) );
		System.out.println( s.substring(1,3) );
		System.out.println( (s.compareTo ( t ) < 0) );
		System.out.println( s.substring(1,3) );	 
		
		int xx = 1;
		boolean IsEven = false;
		if ( xx % 2 == 1 ) {
			IsEven = false;
			System.out.println( IsEven );
		}
		else {
			IsEven = true;
			System.out.println( IsEven );
		}
	}
}
