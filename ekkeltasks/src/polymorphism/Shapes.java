/**
 * 
 */
package polymorphism;

import java.util.*;

/**
 * @author Andrew
 * 
 */
// : polymorphism/shape/Shape.java
class Shape {
    public void draw() {
    }

    public void erase() {
    }

    public void print() {
	System.out.println("It is shape");
    }
} // /:~
// : polymorphism/shape/Circle.java

class Circle extends Shape {
    @Override
    public void draw() {
	System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
	System.out.println("Circle.erase()");
    }

    @Override
    public void print() {
	// TODO Auto-generated method stub
	System.out.println("It is shape - Circle!");
    }
} // /:~
// : polymorphism/shape/Square.java

class Square extends Shape {
    @Override
    public void draw() {
	System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
	System.out.println("Square.erase()");
    }

    @Override
    public void print() {
	// TODO Auto-generated method stub
	System.out.println("It is shape - Square!");
    }
}

// /:~
// : polymorphism/shape/Triangle.java

class Triangle extends Shape {
    @Override
    public void draw() {
	System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
	System.out.println("Triangle.erase()");
    }

    @Override
    public void print() {
	// TODO Auto-generated method stub
	System.out.println("It is shape - Triangle!");
    }
}

// /:~
// : polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.

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
} // /:~
// : polymorphism/Shapes.java
// Polymorphism in Java.

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
	Shape[] s = new Shape[9];
	// Fill up the array with shapes:
	for (int i = 0; i < s.length; i++)
	    s[i] = gen.next();
	// Make polymorphic method calls:
	for (Shape shp : s)
	    shp.print();
    }
}
