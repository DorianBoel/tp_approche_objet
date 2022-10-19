package tp.part1;

import static utils.GeneralUtils.display;
import static utils.GeneralUtils.displayErr;

import enums.ArithmeticOperationType;
import utils.tp.part1.AverageCalculator;
import utils.tp.part1.Operations;

public class TpOperations {

	public static void main(String[] args) {
		
		// Test de chaque type d'opération sur deux nombres
		double a = 50, b = .5;
	
		for (ArithmeticOperationType op : ArithmeticOperationType.values()) {
			try {
				display(op.toString() + ": " + Operations.calculate(a, b, op));
			} catch (Exception err) {
				displayErr(err);
			}
		}
		
		
		// Test de calcul moyenne sur deux tableaux
		double[][] numTable = {
			{12.5, 3, 78, 565.32},
			{2.3, 1, -.01, .88, -.45}
		};
		
		for (double[] numArray : numTable) {
			// Instanciation d'une nouvelle instance de la classe 'AverageCalculator'
			AverageCalculator averageCalculator = new AverageCalculator();
			// On fait passer le tableau dans la classe pour qu'il soit traité
			averageCalculator.push(numArray);
			// Affichage de la moyenne obtenue
			display(averageCalculator.calculateAverage());
		}
		
	}
	
}