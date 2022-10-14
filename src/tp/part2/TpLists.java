package tp.part2;

import static utils.GeneralUtils.display;
import static utils.GeneralUtils.displayInCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TpLists {

	public static void main(String[] args) {
		
		// Initialisation d'une nouvelle liste d'entiers vide
		List<Integer> integerList1 = new ArrayList<>();
	
		// On y ajoute les nombres de 1 à 100
		for (int i = 1; i <= 100; i++) {
			integerList1.add(i);
		}	
	
		// Taille de la liste
		display(integerList1.size());
		
		// On initialise 2 listes contenant des chaînes de caractères
		List<String> list1 = new ArrayList<>(Arrays.asList("Rouge", "Vert", "Orange"));
		List<String> list2 = new ArrayList<>(Arrays.asList("Blanc", "Bleu", "Orange"));
		
		// Puis on initialise une nouvelle liste vide
		List<String> list3 = new ArrayList<>();
		
		// On remplit la nouvelle liste avec les données des listes précédentes
		for (List<String> list : new ArrayList<List<String>>(Arrays.asList(list1, list2))) {
			for (String str : list) {
				list3.add(str);
			}
		}
		display(list3);
		displayInCollection(list3);
		
		// Initialisation d'une nouvelle liste d'entiers
		List<Integer> integerList2 = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
		
		// On affiche chaque élément de cette liste
		displayInCollection(integerList2);
		
		// Taille de la liste
		display(integerList2.size());
		
		// On recherche le plus grand élément de la liste
		int maxValue = Integer.MIN_VALUE;
		for (int n : integerList2) {
			if (n > maxValue) {
				maxValue = n;
			}
		}
		display(maxValue);
		
		// On recherche la valeur la plus petite de la liste
		int minValue = Integer.MAX_VALUE;
		for (int n : integerList2) {
			if (n < minValue) {
				minValue = n;
			}
		}
		display(minValue);
		
		// On supprime cette valeur
		integerList2.remove((Integer) minValue);
		
		// On convertit chaque nombres négatif de la liste en son opposé
		for (int i = 0; i < integerList2.size(); i++) {
			int atIdx = integerList2.get(i);
			if (atIdx < 0) {
				integerList2.set(i, -atIdx);
			}
		}
		
		// Affichage de la liste résultante
		displayInCollection(integerList2);
		
	}
	
}
