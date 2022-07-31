
import java.util.Scanner;

public class ShoppingCartDriver {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
     
      String productName;
      double productPrice = 0.0;
      int productQuantity = 0;
      double cartTotal = 0.0;
  
      // Instantiate two ItemToBuy objects: item1 and item2
      // ItemToBuy item1 =

      String [] tokens = null;

      // Get item 1 details from user, create itemToPurchase object
      System.out.println("Item 1");
      System.out.println("Enter comma separated list: name, price, quantity:");
      tokens = scnr.nextLine().split(",");

      productName = tokens[0].strip();
      productPrice = Double.parseDouble( tokens[1].strip() );
      productQuantity = Integer.parseInt( tokens[2].strip() );
      
      // set the instance fields for item1 using the setter methods.
      // item1.setName( ... ); etc.
      
      System.out.println("");

      // Repeat for item2 here:
      
      
      // Add costs of two items and print total. Use the getPrice and getQuantity methods.
     
     
     
      System.out.println("List"); // use the to String method for both items here:
      // System.out.println(  );
      // System.out.println(  );
      
      System.out.println("Items Receipt:"); // print detailed receipt for both items:
      System.out.printf("%s %d @ $%.2f = $%.2f\n", item1.getName(), item1.getQuantity(),
                         item1.getPrice(),  (item1.getPrice() * item1.getQuantity()));
      
              
      System.out.println("");
      System.out.printf("Total: $%.2f\n", cartTotal);
         
   }
}
