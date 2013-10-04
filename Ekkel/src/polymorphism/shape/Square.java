//: polymorphism/shape/Square.java 
package polymorphism.shape;

import static staticPack.StaticPrint.print;

public class Square extends Shape {
	@Override
	public void draw() {
		print("Square.draw()");
	}

	@Override
	public void erase() {
		print("Square.erase()");
	}

	@Override
	public void printShape(){
		System.out.println("print -> Square");
	}
}