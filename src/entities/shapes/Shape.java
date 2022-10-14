package entities.shapes;

/**
 * Abstract class representing a geometric shape.
 * 
 * @author DorianBoel
 */
public abstract class Shape {

	/**
	 * Calculates this shape's perimeter.
	 * 
	 * @return This shape's perimeter
	 */
	public abstract double getPerimeter();
	
	/**
	 * Calculates this shape's surface.
	 * 
	 * @return This shape's surface
	 */
	public abstract double getSurface();
	
}
