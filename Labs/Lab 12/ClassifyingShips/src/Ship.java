
public class Ship {
	
	private String shipName;
	private String shipCrew;
	
	public Ship ( String sName, String sCrew ) {
		shipName = sName;
		shipCrew = sCrew;
	}
	
	public void setName ( String sName ) {
		shipName = sName;
	}
	public void setCrew ( String sCrew ) {
		shipCrew = sCrew;
	}
	
	public String getName () {
		return shipName;
	}
	public String getCrew () {
		return shipCrew;
	}
	
	public String toString () {
		String str = 
						String.format("Name: %s\n", shipName) + 
						String.format("Crew: %s\n", shipCrew);
		return str;
	}
}
