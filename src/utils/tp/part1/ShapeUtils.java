package utils.tp.part1;

import static utils.GeneralUtils.formatNumber;

import interfaces.Shape;
import utils.DisplayUtils;
import utils.NonInstantiable;

/**
 * Non-instantiable class containing utility methods
 * related to geometric {@link Shape} objects.
 *
 * @author DorianBoel
 */
public final class ShapeUtils extends NonInstantiable {
	
	/**
	 * Displays the common properties of a geometric {@link Shape} object.
	 * 
	 * @param shape The shape from which to display info
	 */
	public static void displayShapeInfo(Shape shape) {
		DisplayUtils.display(String.format(
			"Type: %s; Périmètre: %s; Surface: %s",
			shape.getClass().getSimpleName(),
			formatNumber(shape.getPerimeter()),
			formatNumber(shape.getSurface())
		));
	}

	
}
