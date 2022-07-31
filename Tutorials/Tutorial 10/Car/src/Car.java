
public class Car {
	
	private String make;
	private String model;
	private int year;
	
	public Car() {} //no-arg default const
	
	public Car (String mk, String md, int yr) {
		make = mk;
		model = md;
		year = yr;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setMake( String mk) {
		this.make = mk;
	}
	
	public void setModel( String md) {
		this.model = md;
	}
	
	public void setYear( int yr) {
		this.year = yr;
	}
	
	public String toString() {
		String str = String.format("Make : %s\n", this.make) +
				     String.format("Model : %s\n", this.model) +
				     String.format("Year : %d\n", this.year);
		return str;
	}
}
