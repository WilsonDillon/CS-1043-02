
public class ItemToBuy {
   // private instance fields go here:
	private String itemName; // Initialized in the nor-arg constructor to "none"
	private double itemPrice; //Initialized in default constructor to 0
	private int itemQuantity; //Initialized in default constructor to 0
   // no-arg Constructor here: 
	public ItemToBuy() {
		itemName = "none";
		itemPrice = 0;
		itemQuantity = 0;
	}
   // setters (mutators) and getters (accessors) here:
	public void setName( String newName ) {
		itemName = newName;
	}
	public void setPrice( double newPrice ) {
		itemPrice = newPrice;
	}
	public void setQuantity( int newQuantity ) {
		itemQuantity = newQuantity;
	}
	public String getName() {
		return itemName;
	}
	public double getPrice() {
		return itemPrice;
	}
	public int getQuantity() {
		return itemQuantity;
	}

   // toString method here:
	public String toString() {
		return String.format("Name: %s\nQuantity: %d\nPrice / Item: $%.2f\n", itemName, itemQuantity, itemPrice );
	}
	   // String.format("Name: %s\nQuantity: %d\nPrice / Item: $%.2f\n", itemName, itemQuantity, itemPrice ); 

}
