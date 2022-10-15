package tp.part2;

import static utils.GeneralUtils.display;
import static utils.GeneralUtils.displayInCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import entities.Country;

public class TpSets2 {

	public static void main(String[] args) {
		
		// Initialisation d'une liste contenant plusieurs instances de ville
		Set<Country> countries = new HashSet<>(Arrays.asList(
			new Country("USA", 334_805_000, 59_495),
			new Country("France", 65_585_000, 43_551),
			new Country("Allemagne", 83_884_000, 50_206),
			new Country("UK", 68_498_000, 43_620),
			new Country("Italie", 60_263_000, 37_970),
			new Country("Japon", 125_585_000, 42_659),
			new Country("Chine", 1_448_471_000, 16_624),
			new Country("Russie", 145_806_000, 24_789),
			new Country("Inde", 1_406_632_000, 6_571)
		));
		
		// On recherche le pays ayant le plus grand PIB par habitant
		Country maxGdpCapitaCountry = null;
		int maxValue1 = Integer.MIN_VALUE;
		for (Country country : countries) {
			if (country.getGdpCapita() > maxValue1) {
				maxValue1 = country.getGdpCapita();
				maxGdpCapitaCountry = country;
			}
		}
		display(maxGdpCapitaCountry);
		
		// On recherche le pays ayant le plus grand PIB
		Country maxTotalGdpCountry = null;
		long maxValue2 = Long.MIN_VALUE;
		for (Country country : countries) {
			if (country.getTotalGdp() > maxValue2) {
				maxValue2 = country.getTotalGdp();
				maxTotalGdpCountry = country;
			}
		}
		display(maxTotalGdpCountry);
		
		// On met en majuscules le nom du pays ayant le plus petit PIB
		Country minTotalGdpCountry = null;
		long minValue = Long.MAX_VALUE;
		for (Country country : countries) {
			if (country.getTotalGdp() < minValue) {
				minValue = country.getTotalGdp();
				minTotalGdpCountry = country;
			}
		}
		minTotalGdpCountry.setName(minTotalGdpCountry.getName().toUpperCase());
		display(minTotalGdpCountry);
		
		// On le supprime du set
		countries.remove(minTotalGdpCountry);
		
		// Liste finale
		displayInCollection(countries);
		
	}
	
}
