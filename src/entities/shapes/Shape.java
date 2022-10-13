package entities.shapes;

import static utils.GeneralUtils.display;
import static utils.GeneralUtils.formatNumber;

/**
 * Abstract class representing a geometric shape.
 * 
 * @author DorianBoel
 */
public abstract class Shape {
	
	/**
	 * Displays the common properties of a geometric {@link Shape} object.
	 * 
	 * @param shape The shape to display info of
	 */
	public static void displayShapeInfo(Shape shape) {
		display(String.format(
				"Type: %s; Périmètre: %s; Surface: %s",
				shape.getClass().getSimpleName(),
				formatNumber(shape.getPerimeter()),
				formatNumber(shape.getSurface())
			)
		);
	}

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
