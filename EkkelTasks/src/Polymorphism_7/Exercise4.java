/**
 * 
 */
package Polymorphism_7;

import java.util.Random;

/**
 * @author Богдан
 * 
 */
public class Exercise4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Shapes2.main(args);

    }

}

class Shape2 {
    public void draw() {
    }

    public void erase() {
    }

    public void print() {

    }
}

class Circle2 extends Shape2 {
    public void draw() {
	System.out.println("Circle2.draw()");
    }

    public void erase() {
	System.out.println("Circle2.erase()");
    }

    @Override
    public void print() {
	System.out.println("Circle2.print()");
    }

}

class Square2 extends Shape2 {
    public void draw() {
	System.out.println("Square2.draw()");
    }

    public void erase() {
	System.out.println("Square2.erase()");
    }

    @Override
    public void print() {
	System.out.println("Square2.print()");
    }
}

class Triangle2 extends Shape2 {
    public void draw() {
	System.out.println("Triangle2.draw()");
    }

    public void erase() {
	System.out.println("Triangle2.erase()");
    }

    @Override
    public void print() {
	System.out.println("Triangle2.print()");
    }
}

class Oval extends Shape2 {
    public void draw() {
	System.out.println("Oval.draw()");
    }

    public void erase() {
	System.out.println("Oval.erase()");
    }

    @Override
    public void print() {
	System.out.println("Oval.print()");
    }
}

class RandomShapeGenerator2 {
    private Random rand = new Random(47);

    public Shape2 next() {
	switch (rand.nextInt(4)) {
	default:
	case 0:
	    return new Circle2();
	case 1:
	    return new Square2();
	case 2:
	    return new Triangle2();
	case 3:
	    return new Oval();
	}

    }
}

class Shapes2 {
    private static RandomShapeGenerator2 gen2 = new RandomShapeGenerator2();

    public static void main(String[] args) {
	Shape2[] s = new Shape2[20];
	// Fill up the array with shapes:
	for (int i = 0; i < s.length; i++)
	    s[i] = gen2.next();
	// Make polymorphic method calls:
	for (Shape2 shp : s)
	    shp.draw();
    }
}