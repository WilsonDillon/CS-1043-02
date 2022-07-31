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
      myPet.setName(petName);
      myPet.setAge(petAge);
      System.out.println(myPet.toString());
      
      // add a new line here
      System.out.println();   
      System.out.println("Enter dog pet name, age, and breed as: name, age, breed" );
      tokens = scnr.nextLine().split(",");
      dogName = tokens[0].strip();
      dogAge = Integer.parseInt( tokens[1].strip() );
      dogBreed = tokens[2].strip();
      // TODO: Assign the inputs to myDog with the setters,
      //       then print using toString().  
      myDog.setName(dogName);
      myDog.setAge(dogAge);
      myDog.setBreed(dogBreed);
      System.out.println(myDog.toString());
      System.out.println("   Breed: " + myDog.getBreed());

      // TODO: Use getBreed(), to print the dog breed.
     
      
      scnr.close();
   }
}