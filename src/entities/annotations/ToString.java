package entities.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates if a field declaration of an object should be displayed
 * within an overridden {@link Object#toString toString}
 * method, and how it should be formatted.
 *
 * @author DorianBoel
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ToString {

	/**
	 * Whether or not the field's value should be converted to
	 * uppercase letters, if applicable. Defaults to false.
	 * 
	 * @return A boolean value indicating if the value should be
	 * converted to uppercase or not
	 */
	boolean uppercase() default false;
	
	/**
	 * A string to be displayed after the field value
	 * to separate it from the next and/or to label
	 * the nature of the field and its value. Defaults to an empty string.
	 * 
	 * @return The separator string
	 */
	String separator() default "";
	
}
