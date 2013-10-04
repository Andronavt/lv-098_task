/**
 * 
 */
package Polymorphism;

import java.util.Random;

class Shape {
    public void draw() {
    }

    public void erase() {
    }

    public void message() {
	System.out.println("MEssaaging");
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
    public void message() {
	System.out.println("MEssaaging from Triangle");
    }
}

class MyType extends Shape{
    
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

/**
 * @author Oleg
 * 
 */
public class Example234 {

    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
	Shape[] s = new Shape[9];
	MyType a= new MyType();
	a.draw();
	a.message();
	System.out.println("======================");
	
	for (int i = 0; i < s.length; i++)
	    s[i] = gen.next();
	for (Shape shp : s) {
	    shp.draw();
	    shp.message();
	}
    }
}
