//"Фабрика" случайных фигур. 
package polymorphism.shape;

import java.util.*;

public class RandomShapeGenerator {
	private Random rand = new Random();

	public Shape next(int i) {
		switch (rand.nextInt(i)) {
		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		case 3:
			return new Rectangle();
		}
	}
}