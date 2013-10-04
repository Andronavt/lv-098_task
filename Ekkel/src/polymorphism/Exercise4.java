/**
 * 
 */
package polymorphism;

import polymorphism.shape.RandomShapeGenerator;
import polymorphism.shape.Shape;

/**
 * @author orecto
 *
 */
public class Exercise4 {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();

	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		// Fill up the array with shapes:
		for (int i = 0; i < s.length; i++)
			s[i] = gen.next(4);
		// Make polymorphic method calls:
		for (Shape shp : s){
			shp.draw();
			shp.printShape();
		}
		
	}
}
/*Add a new type of Shape to Shapes.java and verify in main( ) that 
polymorphism works for your new type as it does in the old types*/