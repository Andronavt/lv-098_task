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

ex 6
modify Shapes.java so that it can "highlight" (set a flag in) all shapes of a particular type. The toString() method for each
derived Shape should indicate whether that Shape is "highlighted."
 */

import java.util.Arrays;
import java.util.List;


abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }
    abstract public void setFlag(boolean flag);
    abstract public boolean getFlag();
    abstract public String toString();
}

class Circle extends Shape {

    private boolean flag;

    @Override
    public void setFlag(boolean flag) {
        this.flag=flag;
    }

    @Override
    public boolean getFlag() {
        return flag;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String toString() {
        return (getFlag()?"H":"Unh")+"ighlighted"+"Circle";
    }
}

class Square extends Shape {


    private boolean flag;

    @Override
    public void setFlag(boolean flag) {
        this.flag=flag;
    }

    @Override
    public boolean getFlag() {
        return flag;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String toString() {
        return (getFlag()?"H":"Unh")+"ighlighted"+"Square";
    }
}

class Triangle extends Shape {

    private boolean flag;

    @Override
    public void setFlag(boolean flag) {
        this.flag=flag;
    }

    @Override
    public boolean getFlag() {
        return flag;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String toString() {
        return (getFlag()?"H":"Unh")+"ighlighted"+"Triangle";
    }
}

class Rhomboid extends Shape {


    private boolean flag;

    @Override
    public void setFlag(boolean flag) {
        this.flag=flag;
    }

    @Override
    public boolean getFlag() {
        return flag;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String toString() {
        return (getFlag()?"H":"Unh")+"ighlighted"+"Rhomboid";
    }
}

public class Shapes {

    public static void setFlag(Shape s){
        if (s instanceof Rhomboid){
            ((Rhomboid)s).setFlag(true);
        }
    }

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

        System.out.println("--------------");
        for (Shape shape : shapeList)    {
            setFlag(shape);
            System.out.println(shape);
        }

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
