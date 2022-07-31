/*
 *  Commercial is a derived child-class of Building
 */
public class Commercial extends Building {
	
	// Class instance fields go here:

	private String businessName;
	private int numEmployees;
	private boolean foodService;
	
	// Write the argument constructor
	
	public Commercial ( String own, String addr, double sqFt, String bName, int numEmp, boolean foodS ) {
		super ( own, addr, sqFt );
		businessName = bName;
		numEmployees = numEmp;
		foodService = foodS;
	}
	// Accessor and Mutator methods go here:
	
	public String getBusinessName () {
		return businessName;
	}
	public void setBusinessName ( String bName ) {
		businessName = bName;
	}
	public int getNumEmployees () {
		return numEmployees;
	}
	public void setNumEmployees ( int numEmp ) {
		numEmployees = numEmp;
	}public boolean isFoodService () {
		return foodService;
	}
	public void setFoodService ( boolean foodS  ) {
		foodService = foodS;
	}
	
	// Write the toString method using String.format()
	
	public String toString() {
		String str = 	super.toString() + 
						String.format("Business Name: %s\n", businessName ) +
 						String.format("Employees: %d\n", numEmployees ) +
 						String.format("Food: %b\n", foodService);
		return str;
	}
}