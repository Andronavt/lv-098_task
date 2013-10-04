package polymorphism;

import polymorphism.shape.RandomShapeGenerator;
import polymorphism.shape.Shape;

/**
 * @author orecto
 * 
 */
public class Exercise2 {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();

	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		// Fill up the array with shapes:
		for (int i = 0; i < s.length; i++)
			s[i] = gen.next(2);
		// Make polymorphic method calls:
		for (Shape shp : s)
			shp.draw();
	}
}
/* add the @Override annotation to the shapes example */