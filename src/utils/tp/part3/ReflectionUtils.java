package utils.tp.part3;

import java.lang.reflect.Field;

import entities.exceptions.ReflectionException;
import utils.NonInstantiable;

/**
 * Non-instantiable class containing class reflection
 * utility methods, such as displaying properties within
 * an object.
 * 
 * @author DorianBoel
 */
public class ReflectionUtils extends NonInstantiable {
	
	/**
	 * Displays the name and value of 
	 * each accessible attributes in a given object.
	 * 
	 * @param obj The object from which to display attributes
	 * @throws IllegalArgumentException If this {@code Field} object
	 * is enforcing Java language access control and the underlying
     * field is inaccessible
	 * @throws IllegalAccessException If the specified object is not an
     * instance of the class or interface declaring the underlying
     * field (or a subclass or implementor thereof)
	 * @throws ReflectionException If the given object is null or its properties
	 * cannot be accessed
	 */
	public static void displayAttributes(Object obj) throws IllegalArgumentException, IllegalAccessException, ReflectionException {
		if (obj == null) {
			throw new ReflectionException("Cannot read properties of null");
		}
		Class<?> objClass = obj.getClass();
		Field[] fields = objClass.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			System.out.println(String.format("Attribut '%s' = %s", field.getName(), field.get(obj).toString()));
		}
		System.out.println();
	}
	
}
