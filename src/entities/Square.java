package entities;

/**
 * Represents a geometric square
 *
 * @author DorianBoel
 */
public class Square extends Rectangle {

	/**
	 * Constructor for {@link Square}.
	 * 
	 * Creates a new square with the new dimensions.
	 * 
	 * @param side The length of one of the square's sides
	 */
	public Square(double side) {
		super(side, side);
	}

}
