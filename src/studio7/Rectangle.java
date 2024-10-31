package studio7;

public class Rectangle {

	private double length;
	private double width;
	
	Rectangle(double L, double W) {
		length = L;
		width = W;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return (2 * length) + (2 * width);
	}
	
	public boolean isSmaller(Rectangle r) {
		return this.getArea() < r.getArea();
	}
	
	public boolean isSquare() {
		return length == width;
	}
	
	
	
	
	
	
}
