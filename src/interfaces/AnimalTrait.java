package interfaces;

import enums.zoo.TraitType;

/**
 * Interface to be implemented by enumerations
 * listing the traits regarding an animal's behavior
 * and/or classification.
 *
 * @author DorianBoel
 */
public interface AnimalTrait extends Labeled {
	
	/**
	 * Getter for the trait's type.
	 * 
	 * @return The trait's type
	 */
	TraitType getType();
	
}
