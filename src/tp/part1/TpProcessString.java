package tp.part1;

import static utils.GeneralUtils.display;
import static utils.GeneralUtils.displayInArray;

import entities.Employee;;

public class TpProcessString {

	public static void main(String[] args) {
		
		final char SEMICOLON = ';';
	
		// Déclaration d'une chaîne de caractères
		final String str = "Durand;Marcel;2 523.5";
		
		// On récupère le premier caractère de la chaîne grâce à la méthode 'charAt'
		char charAt0 = str.charAt(0);
		display(charAt0);
		
		// On affiche la longueur de la chaîne
		display(str.length());
		
		// On récupère l'index du premier caractère qui équivaut à ';' dans la chaîne
		int semicolonIdx1 = str.indexOf(SEMICOLON);
		display(semicolonIdx1);
		
		// On extrait le champ correspondant au nom de famille dans la chaîne
		String lastName = str.substring(0, semicolonIdx1);
		display(lastName);
		
		// On affiche le nom de famille en majuscules puis en minuscules
		display(lastName.toUpperCase());
		display(lastName.toLowerCase());
		
		// On récupère chaque valeur séparée par un point-virgule dans un tableau
		String[] splitArr = str.split(Character.toString(SEMICOLON));
		displayInArray(splitArr);
		
		String firstName = splitArr[1];
		// Suppression des espaces pour pouvoir convertir un String en double
		double salary = Double.parseDouble(splitArr[2].replace(" ", ""));
		
		// On instancie la classe 'Employee' avec les valeurs du tableau
		Employee employee1 = new Employee(lastName, firstName, salary);
		display(employee1.toString());
		
	}
	
}
