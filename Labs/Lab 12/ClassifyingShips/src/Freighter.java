
public class Freighter extends Ship {
	
	private double capacity;
	
	public Freighter ( String sName, String sCrew, double sCap ) {
		super( sName, sCrew);
		capacity = sCap;
	}
	
	public void setCap (double sCap) {
		capacity = sCap;
	}
	
	public double getCap () {
		return capacity;
	}
	
	public String toString() {
		String str = 
						super.toString() +
						String.format("Capacity: %.1f\n", capacity);
		return str;
	}
}
