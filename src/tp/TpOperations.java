package tp;

import enums.ArithmeticOperationType;
import utils.Operations;

import static utils.GeneralUtils.display;

public class TpOperations {

	public static void main(String[] args) {
		
		// Test de chaque type d'opération sur deux nombres
		double a = 50, b = .5;
	
		for (ArithmeticOperationType op : ArithmeticOperationType.values()) {
			display(op.toString() + ": " + Operations.calculate(a, b, op));
		}
		
	}
	
}
