package utils.tp.part1;

import entities.shapes.Circle;
import utils.NonInstantiable;

/**
 * Non instantiable class used to instantiate {@link entities.shapes.Circle Circles}.
 * 
 * @author DorianBoel
 */
public final class CircleFactory extends NonInstantiable {
	
	/**
	 * Creates a new {@link Circle} object with the given radius.
	 * 
	 * @param radius The radius of the circle to create
	 * @return A newly created circle instance
	 */
	public static Circle createCircle(double radius) {
		return new Circle(radius);
	}
	
}
