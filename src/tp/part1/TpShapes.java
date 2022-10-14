package tp.part1;

import static utils.GeneralUtils.display;

import entities.shapes.Circle;
import entities.shapes.Rectangle;
import entities.shapes.Square;
import utils.tp.part1.CircleFactory;
import utils.tp.part1.ShapeUtils;

public class TpShapes {
	
	public static void main(String[] args) {
	
		// Instanciation de 2 objets cercles différents avec la classe factory
		Circle circle1 = CircleFactory.createCircle(3.5);
		Circle circle2 = CircleFactory.createCircle(42.83);
			
		// On affiche le périmètre de chaque cercle
		display(circle1.getPerimeter());
		display(circle2.getPerimeter());
		
		// On affiche la surface de chaque cercle
		display(circle1.getSurface());
		display(circle2.getSurface());
		
		// Instanciation d'un rectangle et d'un carré
		Rectangle rectangle1 = new Rectangle(3, 7);
		Square square1 = new Square(9);
		
		// Affichage des propriétés communes de la classe 'Shape' grâce à la méthode statique
		ShapeUtils.displayShapeInfo(circle1);
		ShapeUtils.displayShapeInfo(rectangle1);
		ShapeUtils.displayShapeInfo(square1);
		
	}
	
}
