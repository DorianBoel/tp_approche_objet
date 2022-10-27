package entities.shapes;

import interfaces.Shape;

/**
 * Represents a geometric rectangle shape
 *
 * @author macbook
 */
public class Rectangle implements Shape {
	
	/**
	 * The length of the top and bottom sides of the rectangle.
	 */
	private double length;
	
	
	/**
	 * The height of the left and right sides of the rectangle.
	 */
	private double height;
	
	/**
	 * Constructor for {@link Rectangle}.
	 * 
	 * Creates a new rectangle with the given dimensions.
	 * 
	 * @param length The rectangle's length
	 * @param height The rectangle's height
	 */
	public Rectangle(double length, double height) {
		this.length = length;
		this.height = height;
	}

	/**
	 * Calculates this rectangle's perimeter using the
	 * <i>2*(length + height)</i> formula.
	 * 
	 * @return This rectangle's perimeter
	 */
	@Override
	public double getPerimeter() {
		return 2 * (length + height);
	}

	/**
	 * Calculates this rectangle's surface area using the
	 * <i>length * height</i> formula.
	 * 
	 * @return This rectangle's surface area
	 */
	@Override
	public double getSurface() {
		return length * height;
	}
	
	/**
	 * Getter for {@link #length}.
	 * 
	 * @return This rectangle's length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * Getter for {@link #height}.
	 * 
	 * @return This rectangle's height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Setter for {@link #length}
	 * 
	 * @param length The new length to replace the current one
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * Setter for {@link #height}
	 * 
	 * @param length The new height to replace the current one
	 */
	public void setHeight(double height) {
		this.height = height;
	}

}
