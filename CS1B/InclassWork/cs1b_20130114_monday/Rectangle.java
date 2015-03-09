package cs1b_20130114_monday;

/**
 * One object of this class represents one Rectangle's length and width.
 */
public class Rectangle {
	private double length; // instance variable

	private double getLength() {
		return length;
	} // getter

	private void setLength(double newLength) {
		length = newLength;
	} // setter

	private double width; // instance variable

	private double getWidth() {
		return width;
	} // getter

	private void setWidth(double newWidth) {
		width = newWidth;
	} // setter

	void initialize(double initLength, double initWidth) {
		this.setLength(initLength);
		this.setWidth(initWidth);
	}

	public Rectangle() // default constructor
	{
		this.initialize(0, 0);
	}

	public Rectangle(double l, double w) {
		this.initialize(l, w);
	}

	/**
	 * Returns the area of the Rectangle that called it.
	 */
	public double calculateArea() {
		return this.getLength() * this.getWidth();
	}

	public String toString() // overrides Object�s method
	{
		return "length=" + this.getLength() + ", and width=" + this.getWidth();
	}
	
	void thisTest(Rectangle rec){
		System.out.println("this.width: " + this.width);
		System.out.println("width: " + width);
	}
}