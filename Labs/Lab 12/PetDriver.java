import java.util.Scanner;

public class PetDriver {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Pet myPet = new Pet();
      Dog myDog = new Dog();
      
      String petName, dogName, dogBreed;
      int petAge, dogAge;

      String [] tokens;
      System.out.println("Enter generic pet name and age as: name, age" );
      tokens = scnr.nextLine().split(",");
      petName = tokens[0].strip();
      petAge = Integer.parseInt( tokens[1].strip() );
      
      // TODO: Assign the generic pet (using petName, petAge) to myPet with the setters,
      //       then print using toString(). 
      
      
      // add a new line here
         
      System.out.println("Enter dog pet name, age, and breed as: name, age, breed" );
      
      // TODO: Assign the inputs to myDog with the setters,
      //       then print using toString().  


      // TODO: Use getBreed(), to print the dog breed.
     
      
      scnr.close();
   }
}