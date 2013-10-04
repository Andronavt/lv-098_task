/**
 * Exercise 31:   (3) Modify polymorphism/shape/RandomShapeGenerator.java to 
 * make it Iterable. Youíll need to add a constructor that takes the number of elements that 
 * you want the iterator to produce before stopping. Verify that it works.
 */
package holdingYourObjects_10;

import java.util.Iterator;
import java.util.Random;

/**
 * @author ¡Ó„‰‡Ì
 * 
 */
public class Exercise31 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	RandomShapeGenerator rsg = new RandomShapeGenerator(15);
	for (Shape s: rsg){
	    s.draw();
	}

    }

}

class RandomShapeGenerator implements Iterable<Shape> {
    private Shape[] array;
    private Random rand = new Random(47);

    public RandomShapeGenerator(int count) {
	array = new Shape[count];
	for(int i=0; i< count; i++){
	    array[i] = genShape();
	}
	
    }

    public Shape genShape() {
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

    public Iterator<Shape> iterator() {
	return new Iterator<Shape>() {
	    private int index = 0;

	    public boolean hasNext() {
		return index < array.length;
	    }

	    public Shape next() {
		return array[index++];
	    }

	    public void remove() {
		throw new UnsupportedOperationException();
	    }
	};
    }

}

class Shape {
    public void draw() {
    }

    public void erase() {
    }
}

class Circle extends Shape {
    public void draw() {
	System.out.println("Circle.draw()");
    }

    public void erase() {
	System.out.println("Circle.erase()");
    }
}

class Square extends Shape {
    public void draw() {
	System.out.println("Square.draw()");
    }

    public void erase() {
	System.out.println("Square.erase()");
    }
}

class Triangle extends Shape {
    public void draw() {
	System.out.println("Triangle.draw()");
    }

    public void erase() {
	System.out.println("Triangle.erase()");
    }
}