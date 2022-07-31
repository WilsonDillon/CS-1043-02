import java.util.Scanner;

public class SeatsNroom {
   public static void main(String[] args) {
	Scanner console = new Scanner( System.in );

	int room = console.nextInt();
	int seats = 0;

	if ( room < 101 || room > 116 )
		System.out.println( "Invalid room number, zero seats." );
	else {   
         // change the if-control block to a switch
		if ( room == 110 || room == 101 || room == 116 )
			   seats = 50;
		else if ( room == 111 || room == 113 )
			   seats = 45;
		else if ( room == 112 || room == 114 )
			   seats = 35;
		else
			   seats = 40;
	   	System.out.printf(
           "Room number %d has %d seats.\n", room, seats );
	}
	console.close();
   }   	// end main
}		// end class
