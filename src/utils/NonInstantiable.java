package utils;

/**
 * Classes inheriting this abstract class should not be instantiated.
 * 
 * @author DorianBoel
 */
public abstract class NonInstantiable {

	/**
	 * Prevents any subclass from being instantiated.
	 */
	protected NonInstantiable() {
		throw new UnsupportedOperationException(
			String.format("The class %s cannot be instantiated.", getClass().getSimpleName())
		);
	}
	
}
