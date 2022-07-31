import java.util.Scanner;

public class ShipDriver {
  public static void main( String [] args ) {

   String name, crew;
   double cap;
   int pass;
   Scanner input = new Scanner( System.in );
   
   String tokens [];
   System.out.printf( "Enter a ship name and crew number: \n" ); 
   //Ship code in here
   tokens = input.nextLine().split(",");
   name = tokens[0].strip();
   crew = tokens[1].strip();
   Ship theShip = new Ship (name, crew);
   System.out.println(theShip.toString());

   System.out.printf( "Enter a freighter name, crew number, and capacity: \n" ); 
   //Freighter code in here
   tokens = input.nextLine().split(",");
   name = tokens[0].strip();
   crew = tokens[1].strip();
   cap = Double.parseDouble( tokens[2].strip() );
   Freighter theFreighter = new Freighter (name, crew, cap);
   System.out.println(theFreighter.toString());

   System.out.printf( "Enter an ocean liner name, crew number, and passengers: \n" ); 
   //Liner code in here
   tokens = input.nextLine().split(",");
   name = tokens[0].strip();
   crew = tokens[1].strip();
   pass = Integer.parseInt( tokens[2].strip() );
   Liner theLiner = new Liner (name, crew, pass);
   System.out.println(theLiner.toString());
   
   input.close();
   
  }	// end main
}	// end class
