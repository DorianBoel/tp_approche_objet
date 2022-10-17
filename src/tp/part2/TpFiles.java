package tp.part2;

import static utils.GeneralUtils.display;
import static utils.GeneralUtils.displayErr;
import static utils.GeneralUtils.displayInCollection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import entities.geo.CensusCity;
import utils.tp.part2.FileAccess;

public class TpFiles {

	public static void main(String[] args) {
		
		try {
			
			// On récupère le contenu du fichier csv
			List<String> lines = FileAccess.getLines(FileAccess.PATHS.get("census"));

			// On définit un chemin pour créer un nouveau fichier
			Path targetPath1 = Paths.get("data/census_sample.csv");

			// On extrait les 100 premières lignes du fichier
			List<String> excerpt = new ArrayList<>();
			int lineLimit = lines.size() > 100 ? 100 : lines.size();
			for (int i = 0; i < lineLimit; i++) {
				excerpt.add(lines.get(i));
			}
			
			// On crée un nouveau fichier au chemin définit et on y rajoute les lignes extraites du premier fichier
			Files.write(targetPath1, excerpt);
			
			// Contenu du nouveau fichier
			List<String> newLines = FileAccess.getLines(targetPath1);
			displayInCollection(newLines);

			// On initialise une liste vide
			List<CensusCity> cities = new ArrayList<>();
			
			// Pour chaque ligne du fichier CSV, on instancie une nouvelle ville en isolant chaque champ séparé par un point-virgule
			for (int i = 1; i < lines.size(); i++) {
				String[] dataArray = lines.get(i).split(";");
				String 
					cityName = dataArray[6],
					departmentCode = dataArray[2],
					regionName = dataArray[1]
				;
				int totalPopulation = Integer.parseInt(dataArray[9].replace(" ", ""));
				cities.add(new CensusCity(cityName, totalPopulation, regionName, departmentCode));
			}
			
			// Nombre total de villes
			display(cities.size());
			
			// On crée ensuite un nouveau fichier CSV ne contenant que les villes dont la populations est > 25 000
			Path targetPath2 = Paths.get("data/census_filter.csv");
			
			List<String> citiesPopulationOver25k = new ArrayList<>();
			citiesPopulationOver25k.add("Nom de la commune;Code département;Nom de la région;Population totale;");
			for (CensusCity city : cities) {
				if (city.getPopulation() > 25_000) {
					String line = String.join(
						";",
						city.getName(),
						city.getDepartmentCode(),
						city.getRegionName(),
						Integer.toString(city.getPopulation())
					) + ";";
					citiesPopulationOver25k.add(line);
				}
			}
			Files.write(targetPath2, citiesPopulationOver25k);
			
			// Nombre de villes résultantes
			display(FileAccess.getLines(targetPath2).size() - 1);
			
		} catch (IOException err) {
			displayErr(err);
		}
		
	}
	
}
