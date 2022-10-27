package tp.part3;

import java.util.Arrays;
import java.util.List;

import entities.zoo.Animal;
import entities.zoo.Zoo;
import enums.zoo.AnimalFamily;
import enums.zoo.Diet;

public class TpZoo {

	public static void main(String[] args) {
		
		// Instanciation d'un nouveau zoo
		Zoo zoo = new Zoo("Thoiry");
		
		// Initialisation d'une liste d'animaux
		List<Animal> animals = Arrays.asList(
			new Animal("Gazelle", AnimalFamily.MAMMAL, Diet.HERBIVOROUS),
			new Animal("Zèbre", AnimalFamily.MAMMAL, Diet.HERBIVOROUS),
			new Animal("Lion", AnimalFamily.MAMMAL, Diet.HERBIVOROUS),
			new Animal("Panthère", AnimalFamily.MAMMAL, Diet.CARNIVOROUS),
			new Animal("Requin blanc", AnimalFamily.FISH, Diet.CARNIVOROUS),
			new Animal("Truite dorée", AnimalFamily.FISH, Diet.HERBIVOROUS),
			new Animal("Boa constrictor", AnimalFamily.REPTILE, Diet.CARNIVOROUS),
			new Animal("Python", AnimalFamily.REPTILE, Diet.CARNIVOROUS)
		);
		
		// Ajout des animaux de la liste au zoo
		for (Animal animal : animals) {
			zoo.addAnimal(animal);
		}
		
		// Affichage de chaque animal du zoo
		zoo.displayAnimals();
		
	}

}
