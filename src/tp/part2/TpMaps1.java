package tp.part2;

import java.util.HashMap;
import java.util.Map;

import utils.DisplayUtils;

public class TpMaps1 {

	public static void main(String[] args) {
		
		// Initialisation d'une nouvelle map et ajout des paires clés - valeurs
		Map<String, Float> salaryMap = new HashMap<>();
		salaryMap.put("Paul", 1750f);
		salaryMap.put("Hicham", 1825f);
		salaryMap.put("Yu", 2250f);
		salaryMap.put("Ingrid", 2015f);
		salaryMap.put("Chantal", 2418f);
		
		// Taille de la map
		DisplayUtils.display(salaryMap.size());
		
		// Initialisation d'une nouvelle map
		Map<Integer, String> cityMap = new HashMap<>();
		cityMap.put(13, "Marseille");
		cityMap.put(34, "Montpellier");
		cityMap.put(44, "Nantes");
		cityMap.put(75, "Paris");
		cityMap.put(31, "Toulouse");
		
		// Ajout de trois nouvelles paires
		cityMap.put(59, "Lille");
		cityMap.put(69, "Lyon");
		cityMap.put(33, "Bordeaux");
		
		// Affichage des clés de la map
		DisplayUtils.displayInCollection(cityMap.keySet());
		
		// Affichage des valeurs de la map
		DisplayUtils.displayInCollection(cityMap.values());
		
		// Taille de la map
		DisplayUtils.display(cityMap.size());
		
		// Initialisation de deux nouvelles maps
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		// Initialisation d'une troisième map
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		// On ajoute chaque paire des 2 maps précédentes dans la troisième
		map3.putAll(map1);
		map3.putAll(map2);
		
		DisplayUtils.displayInMap(map3);
		
	}
	
}
