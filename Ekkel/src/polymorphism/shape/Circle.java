//: polymorphism/shape/Circle.java 
package polymorphism.shape;

import static staticPack.StaticPrint.print;

public class Circle extends Shape {
	@Override
	public void draw() {
		print("Circle.draw()");
	}

	@Override
	public void erase() {
		print("Circle.erase()");
	}
	
	@Override
	public void printShape(){
		System.out.println("print -> Circle");
	}
}