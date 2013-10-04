/**
 * 
 */
package com.softserveinc.edu.lms.polymorphism;

import java.util.Random;

/**
 * @author Maryan
 * 
 */

class Shape {
    public void draw() {
    }

    public void erase() {

    }

    public void print() {
	System.out.println("print() in Shape");
    }

}

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
	System.out.println("print() in Circle");
    }
}

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
	System.out.println("print() in Square");
    }
}

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
	System.out.println("print() in Triangle");
    }
}

/*
 * Exercise4
 */
class Pyramide extends Shape {

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
	System.out.println("print() in Triangle");
    }
}

class RandomShapeGenerator {
    private Random rand = new Random(47);

    public Shape next() {

	switch (rand.nextInt(4)) {
	default:
	case 0:
	    return new Circle();

	case 1:
	    return new Square();

	case 2:
	    return new Triangle();

	case 3:
	    return new Pyramide();

	}

    }

}

class Shapes {

    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    /**
     * @param args
     */
    public static void main(String[] args) {
	Shape[] s = new Shape[9];
	for (int i = 0; i < s.length; i++) {
	    s[i] = gen.next();
	}
	for (Shape shp : s) {
	    shp.draw();
	}
    }

}

public class Exercise2and3and4 {

    public static void main(String[] args) {
	Shapes.main(args);
    }
}