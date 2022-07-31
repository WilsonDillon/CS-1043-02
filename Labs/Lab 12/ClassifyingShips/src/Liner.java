
public class Liner extends Ship {
	
	private int passengers;
	
	public Liner ( String sName, String sCrew, int sPass ) {
		super(sName, sCrew);
		passengers = sPass;
	}
	
	public void setPass ( int sPass ) {
		passengers = sPass;
	}
	
	public int getPass () {
		return passengers;
	}
	
	public String toString () {
		String str = 
						super.toString() +
						String.format("Passengers: %d\n", passengers);
		return str;
	}
}
