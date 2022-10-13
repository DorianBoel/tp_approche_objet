package tp.part1;

import entities.contributors.Contributor;
import entities.contributors.Freelance;
import entities.contributors.Salaried;

public class TpContributor {
	
	public static void main(String[] args) {
		
		// Instanciation de deux contributeurs de classes différentes
		Salaried salaried1 = new Salaried("Duchesne", "Mathilde", 2300f);
		Freelance freelance1 = new Freelance("Lefebvre", "François", 30, 100f);
		
		for (Contributor contributor : new Contributor[] {salaried1, freelance1}) {
			contributor.displayInfo();
		}
	
	}
	
}
