/**
 * 
 */
package polymorphism;

import static staticPack.StaticPrint.print;

class Glyph {
	private void printDemo1(){
		System.out.println("Glyph.printDemo1()");
	}
	
	final void printDemo2(){
		System.out.println("Glyph.printDemo2()");
	}
	
	void draw() {
		print("Glyph.draw()");
	}

	Glyph() {
		print("Glyph() before draw()");
		draw();
		print("Glyph() after draw()");
		
		print("Glyph() before printDemo1()");
		printDemo1();
		print("Glyph() after printDemo1()");
		
		print("Glyph() before printDemo2()");
		printDemo2();
		print("Glyph() after printDemo2()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;

	RoundGlyph(int r) {
		radius = r;
		print("RoundGlyph.RoundGlyph(), radius = " + radius);
	}

	void draw() {
		print("RoundGlyph.draw(), radius = " + radius);
	}
}

class RectangularGlyph extends Glyph {
	private int radius = 1;
	
	private void printDemo1(){
		System.out.println("RectangularGlyph -> private void printDemo1()");
	}
	
//	final void printDemo2(){
//		System.out.println("RectangularGlyph -> private void printDemo2()");
//	}

	RectangularGlyph(int r) {
		radius = r;
		
		print("RectangularGlyph() before printDemo1()");
		printDemo1();
		print("RectangularGlyph() after printDemo1()");
		
		print("RectangularGlyph() before printDemo2()");
		printDemo2();
		print("RectangularGlyph() after printDemo2()");
		
		print("RectangularGlyph.RectangularGlyph(), radius = " + radius);
	}

	void draw() {
		print("RectangularGlyph.draw(), radius = " + radius);
	}
}

public class Exercise15 {
	public static void main(String[] args) {
		new RoundGlyph(5);
		System.out.println();
		new RectangularGlyph(5);
	}
}
/*
 * Add a RectangularGlyph to PolyConstructors.java and demonstrate the problem
 * described in this section
 */