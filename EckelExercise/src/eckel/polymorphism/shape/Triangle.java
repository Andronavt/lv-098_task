//: polymorphism/shape/Triangle.java
package eckel.polymorphism.shape;

public class Triangle extends Shape {
    public void draw() {
	System.out.println("Triangle.draw()");
    }

    public void erase() {
	System.out.println("Triangle.erase()");
    }

    public void show() {
	System.out.println("Triangle.show()");
    }
} // /:~
