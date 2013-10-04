package eckel.holdingyourobjects;

import java.util.Iterator;
import java.util.Random;

import eckel.polymorphism.shape.Circle;
import eckel.polymorphism.shape.Shape;
import eckel.polymorphism.shape.Square;
import eckel.polymorphism.shape.Triangle;

/*
 * ex 31
 */

class RandomShapeGenerator31 implements Iterable<Shape> {
    private Random rand = new Random();

    public Shape make() {
	switch (rand.nextInt(3)) {
	default:
	case 0:
	    return new Circle();
	case 1:
	    return new Square();
	case 2:
	    return new Triangle();
	}
    }

    private Shape[] shapes;

    RandomShapeGenerator31(int n) {
	shapes = new Shape[n];
	for (int i = 0; i < n; i++)
	    shapes[i] = make();

    }

    public Iterator<Shape> iterator() {
	return new Iterator<Shape>() {
	    private int index = 0;

	    public boolean hasNext() {
		return index < shapes.length;
	    }

	    public Shape next() {
		return shapes[index++];
	    }

	    public void remove() {
		throw new UnsupportedOperationException();
	    }
	};
    }
}

public class ThirtyOne {
    public static void main(String[] args) {
	RandomShapeGenerator31 rsg = new RandomShapeGenerator31(20);
	for (Shape s : rsg)
	    System.out.println(s);
    }

}
