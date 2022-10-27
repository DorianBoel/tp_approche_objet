package tp.part2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import utils.DisplayUtils;

public class TpSets1 {

	public static void main(String[] args) {
		
		// On instancie un nouveau set de valeurs double
		Set<Double> doubleSet = new HashSet<>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
		
		// Affichage du contenu du set
		DisplayUtils.displayInCollection(doubleSet);
		
		// On recherche le nombre le plus grand dans le set
		double maxValue = Double.MIN_VALUE;
		for (double db : doubleSet) {
			if (maxValue < db) {
				maxValue = db;
			}
		}
		DisplayUtils.display(maxValue);
		
		// On recherche le nombre le plus petit puis on le supprime du set
		double minValue = Double.MAX_VALUE;
		for (double db : doubleSet) {
			if (minValue > db) {
				minValue = db;
			}
		}
		doubleSet.remove(minValue);
		
		// On affiche à nouveau le contenu du set
		DisplayUtils.displayInCollection(doubleSet);
		
		// On instancie un nouveau set de chaînes de caractères
		Set<String> stringSet = new HashSet<>(Arrays.asList(
			"USA",
			"France",
			"Allemagne",
			"UK",
			"Italie",
			"Japon",
			"Chine",
			"Russie",
			"Inde"
		));
		
		// On recherche la chaîne la plus longue dans le set
		String longestStr = "";
		for (String str : stringSet) {
			if (longestStr.length() < str.length()) {
				longestStr = str;
			}
		}
		DisplayUtils.display(longestStr);
		
		// On la supprime du set
		stringSet.remove(longestStr);
		
		// On affiche à nouveau le contenu du set
		DisplayUtils.displayInCollection(stringSet);
		
	}
	
}
