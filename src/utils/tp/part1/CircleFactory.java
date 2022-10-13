package utils.tp.part1;

import entities.shapes.Circle;

/**
 * Non instantiable class used to instantiate {@link entities.shapes.Circle Circles}.
 * 
 * @author DorianBoel
 */
public final class CircleFactory {

	/**
	 * This class should not be instantiated.
	 */
	private CircleFactory() {
		throw new UnsupportedOperationException("The class " + this.getClass().getSimpleName() + "cannot be instantiated.");
	}
	
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
