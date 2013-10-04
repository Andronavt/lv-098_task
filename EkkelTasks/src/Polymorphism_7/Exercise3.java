/**
 * 
 */
package Polymorphism_7;

import java.util.Random;

/**
 * @author Богдан
 * 
 */
public class Exercise3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Shapes.main(args);
    }

}

class Shape {
    public void draw() {
    }

    public void erase() {
    }
    public void print(){
	
    }
}

class Circle extends Shape {
    public void draw() {
	System.out.println("Circle.draw()");
    }

    public void erase() {
	System.out.println("Circle.erase()");
    }
    @Override
    public void print() {
	System.out.println("Circle.print()");
    }

}

class Square extends Shape {
    public void draw() {
	System.out.println("Square.draw()");
    }

    public void erase() {
	System.out.println("Square.erase()");
    }
    @Override
    public void print() {
	System.out.println("Square.print()");
    }
}

class Triangle extends Shape {
    public void draw() {
	System.out.println("Triangle.draw()");
    }

    public void erase() {
	System.out.println("Triangle.erase()");
    }
    @Override
    public void print() {
	System.out.println("Triangle.print()");
    }
}

class RandomShapeGenerator {
    private Random rand = new Random(47);

    public Shape next() {
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
}

class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
	Shape[] s = new Shape[9];
	// Fill up the array with shapes:
	for (int i = 0; i < s.length; i++)
	    s[i] = gen.next();
	// Make polymorphic method calls:
	for (Shape shp : s)
	    shp.draw();
    }
}
