package eckel.typeinfo;

/*
ex 3
add Rhomboid to Shapes.java. Create a Rhomboid, upcast it to a Shape, then downcast it back to a Rhomboid.
Try downcasting to a Circle and see what happens.

ex 4
modify the previous exercise so that it uses instanceof to check the type before performing the downcast.

ex 5
implement a rotate(Shape) method in Shpaes.java such that it checks to see if it is rotating a Circle (and, if so, doesn't perform
the operation).
 */

import java.util.Arrays;
import java.util.List;


abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {

    @Override
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {

    public static void rotate(Shape s) {
        if (!(s instanceof Circle)) {
            System.out.println(s + " rotate");
        }
    }

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        for (Shape shape : shapeList)
            shape.draw();

        System.out.println("--------------");

        for (Shape shape : shapeList)
            rotate(shape);

        Shape shape = new Rhomboid(); //upcasting

        Rhomboid rhomboid = new Rhomboid();
        if (rhomboid instanceof Shape) {
            rhomboid = (Rhomboid) shape;//downcasting
        }
    }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
