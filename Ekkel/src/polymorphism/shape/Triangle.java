//: polymorphism/shape/Triangle.java 
package polymorphism.shape;

import static staticPack.StaticPrint.print;

public class Triangle extends Shape {
	
	@Override
	public void draw() {
		print("Triangle.draw()");
	}

	@Override
	public void erase() {
		print("Triangle.erase()");
	}
	
	@Override
	public void printShape(){
		System.out.println("print -> Triangle");
	}
}