package entities;

/**
 * Represents a geometric circle shape.
 * 
 * @author DorianBoel
 */
public class Circle extends Shape {

	/**
	 * The radius of the circle.
	 */
	private double radius;
	

	/**
	 * Constructor for {@link Circle}.
	 * 
	 * Creates a new circle with the given radius.
	 * 
	 * @param radius The radius of the circle
	 */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/**
	 * Calculates this circle's perimeter using the
	 * <i>2 * pi * radius</i> formula.
	 * 
	 * @return This circle's perimeter
	 */
	@Override
	public double getPerimeter() {
		return radius * Math.PI * 2;
	}
	
	/**
	 * Calculates this circle's surface area using the
	 * <i>radius^2 * pi</i> formula.
	 * 
	 * @return This circle's surface area
	 */
	@Override
	public double getSurface() {
		return Math.PI * Math.pow(this.radius, 2.0);
	}
	
	/**
	 * Getter for {@link #radius}.
	 * 
	 * @return The radius of this circle
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * Setter for {@link #radius}.
	 * 
	 * @param radius The new radius to replace the current one.
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
