package tp.part1;

import static utils.GeneralUtils.display;

public class TpStaticMethods {

	public static void main(String[] args) {
		
		// Déclaration d'un String représentant un entier
		String number = "82";
		
		// On convertit le String en entier avec une méthode statique de la class Integer
		int parsedNumber = Integer.parseInt(number);
		display(parsedNumber);
		
		// Déclaration de 2 entiers
		int a = -35, b = 5;
		
		// Méthode statique pour déterminer le maximum entre 2 entiers
		int max = Integer.max(a, b);
		display(max);
		
	}
	
}
