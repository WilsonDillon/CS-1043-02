
public class Box {
	private double length;
	private double depth;
	private double height;
	private String color;
	private double volume;
	
	public Box ( double newLength, double newDepth, double newHeight, String newColor ) {
		length = newLength;
		depth = newDepth;
		height = newHeight;
		color = newColor;
		volume = newLength * newDepth * newHeight;
	}
	
	public void setLength( double newLength ) {
		length = newLength;
	}
	public void setDepth( double newDepth ) {
		depth = newDepth;
	}
	public void setHeight( double newHeight ) {
		height = newHeight;
	}
	public void setColor( String newColor ) {
		color = newColor;
	}
	
	public double getLength() {
		return length;
	}
	public double getDepth() {
		return depth;
	}
	public double getHeight() {
		return height;
	}
	public String getColor() {
		return color;
	}
	public double getVolume() {
		volume = length * depth * height;
		return volume;
	}
	
	public String toString() {
		volume = length * depth * height;
		return String.format("Length = %.2f\nDepth = %.2f\nHeight = %.2f\nColor = %s\nVolume = %.2f\n", length, depth, height, color, volume );
	}
}
