package interfaces;

/**
 * Interface to be implemented by geometric shapes.
 * 
 * @author DorianBoel
 */
public interface Shape {

	/**
	 * Calculates this shape's perimeter.
	 * 
	 * @return This shape's perimeter
	 */
	double getPerimeter();
	
	/**
	 * Calculates this shape's surface.
	 * 
	 * @return This shape's surface
	 */
	double getSurface();
	
}
