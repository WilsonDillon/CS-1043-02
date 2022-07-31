import java.util.Scanner;

public class TriangleDriver {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      // Instantiate two triangle objects: triangle1 and triangle2
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
      triangle1.setBase( scnr.nextDouble() );
      triangle1.setHeight( scnr.nextDouble() );
      // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
      triangle2.setBase( scnr.nextDouble() );
      triangle2.setHeight( scnr.nextDouble() );
      // TODO: Determine larger triangle (use getArea())
      
      System.out.println("Triangle with larger area:");
      // TODO: Output larger triangle's info (use printInfo())
      if ( triangle1.getArea() > triangle2.getArea() ) {
    	  System.out.println(triangle1.toString());
     }
      else {
    	  System.out.println(triangle2.toString());
      }
   }
}