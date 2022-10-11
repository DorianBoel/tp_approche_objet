package tp;

import static utils.GeneralUtils.display;

import entities.Circle;
import utils.CircleFactory;

public class TpCircle {
	
	public static void main(String[] args) {
	
		// Instantiation de 2 objets cercles différents avec la classe factory
		Circle circle1 = CircleFactory.createCircle(3.5);
		Circle circle2 = CircleFactory.createCircle(42.83);
			
		// On affiche le périmètre de chaque cercle
		display(circle1.getPerimeter());
		display(circle2.getPerimeter());
		
		// On affiche la surface de chaque cercle
		display(circle1.getSurface());
		display(circle2.getSurface());
	
	}
	
}
