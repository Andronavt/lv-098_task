/**
 * 
 */
package polymorphism.shape;

import static staticPack.StaticPrint.print;

/**
 * @author orecto
 *
 */
public class Rectangle extends Shape {
	@Override
	public void draw() {
		print("Rectangle.draw()");
	}

	@Override
	public void erase() {
		print("Rectangle.erase()");
	}
	
	@Override
	public void printShape(){
		System.out.println("print -> Rectangle");
	}
}
